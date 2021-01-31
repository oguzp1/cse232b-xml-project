package org.raaghavoguz.xmlproject;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;
import org.raaghavoguz.xmlproject.grammar.XGrammarParser;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EngineFunctions {
    private EngineFunctions() { }

    private static List<?> relativeDir(ParseTree rp1, ParseTree rp2, Node node) {
        return EngineUtilities.unique(
                relativePath(rp1, node).stream()
                        .filter(n -> n instanceof Node)
                        .flatMap(n -> relativePath(rp2, (Node) n).stream())
                        .collect(Collectors.toList())
        );
    }

    private static List<?> relativeDirRecursive(ParseTree rp1, ParseTree rp2, Node node) {
        return EngineUtilities.unique(
                Trees.getDescendants(rp1).stream()
                        .filter(n -> n instanceof Node)
                        .flatMap(d -> relativeDir(d, rp2, node).stream())
                        .collect(Collectors.toList())
        );
    }

    private static List<?> relativeConcatenate(Node node, ParseTree... parseTrees) {
        return Arrays.stream(parseTrees)
                .flatMap(pt -> Stream.of(relativePath(pt, node)))
                .collect(Collectors.toList());
    }

    private static List<?> relativeFilter(ParseTree rp1, ParseTree f, Node node) {
        return relativePath(rp1, node).stream()
                .filter(n -> filter(f, (Node) n))
                .collect(Collectors.toList());
    }

    public static List<?> absolutePath(ParseTree tree) throws ParserConfigurationException,
            SAXException, IOException {

        // System.out.println(tree.getClass().getCanonicalName());

        Element root = EngineUtilities.root(tree.getChild(2).getText());
        ParseTree rp = tree.getChild(5);

        if (tree instanceof XGrammarParser.APDirContext) {
            return relativePath(rp, root);
        } else if (tree instanceof XGrammarParser.APDirRecursiveContext) {
            Queue<Node> domQueue = new LinkedList<>();
            domQueue.add(root);

            List<Node> nodeList = new ArrayList<>();

            while (!domQueue.isEmpty()) {
                Node n = domQueue.remove();

                domQueue.addAll(EngineUtilities.children(n));

                //if (n instanceof XGrammarParser.RpContext) {
                    nodeList.addAll((List<Node>) relativePath(rp, n));
                //}
            }

            return nodeList;
            //return relativeDirRecursive(rp.getParent(), rp, root);
        } else {
            throw new IllegalArgumentException("Absolute Path could not be parsed.");
        }
    }

    public static List<?> relativePath(ParseTree tree, Node node) {
        // System.out.println(tree.getClass().getCanonicalName());
        if (tree instanceof XGrammarParser.RPTagNameContext) {
            String tagName = tree.getChild(0).getText();
            return EngineUtilities.children(node).stream()
                    .filter(n -> tagName.equals(n.getNodeName()))
                    .collect(Collectors.toList());
        } else if (tree instanceof XGrammarParser.RPStarContext) {
            return EngineUtilities.children(node);
        } else if (tree instanceof XGrammarParser.RPCurrentDirContext) {
            return Collections.singletonList(node);
        } else if (tree instanceof XGrammarParser.RPParentDirContext) {
            return EngineUtilities.parent(node);
        } else if (tree instanceof XGrammarParser.RPTextContext) {
            List<String> elementList = new ArrayList<>();
            elementList.add(node.getTextContent());
            return elementList;
        } else if (tree instanceof XGrammarParser.RPAttNameContext) {
            ParseTree attribute = tree.getChild(1);
            return EngineUtilities.attrib(node, attribute.toString());
        } else if (tree instanceof XGrammarParser.RPParanthesesContext) {
            return relativePath(tree.getChild(1), node);
        } else if (tree instanceof XGrammarParser.RPDirContext) {
            ParseTree rp1 = tree.getChild(0);
            ParseTree rp2 = tree.getChild(2);
            return relativeDir(rp1, rp2, node);
        }  else if (tree instanceof XGrammarParser.RPDirRecursiveContext) {
            ParseTree rp1 = tree.getChild(0);
            ParseTree rp2 = tree.getChild(2);
            Queue<Node> domQueue = new LinkedList<>();
            domQueue.add(node);

            List<Node> nodeList = new ArrayList<>();
            nodeList.addAll((List<Node>) relativeDir(rp1, rp2, node));

            while (!domQueue.isEmpty()) {
                Node n = domQueue.remove();

                domQueue.addAll(EngineUtilities.children(n));

                nodeList.addAll((List<Node>) relativePath(rp2, n));
            }

            return nodeList;
        } else if (tree instanceof XGrammarParser.RPFilterContext) {
            ParseTree rp1 = tree.getChild(0);
            ParseTree f = tree.getChild(2);
            return relativeFilter(rp1, f, node);
        } else if (tree instanceof XGrammarParser.RPConcatContext) {
            ParseTree rp1 = tree.getChild(0);
            ParseTree rp2 = tree.getChild(2);
            return relativeConcatenate(node, rp1, rp2);
        } else {
            throw new IllegalArgumentException("Relative Path could not be parsed.");
        }
    }

    public static boolean filter(ParseTree tree, Node node) {
        // System.out.println(tree.getClass().getCanonicalName());
        if (tree instanceof XGrammarParser.FRPContext) {
            return !relativePath(tree.getChild(0), node).isEmpty();
        } else if (tree instanceof XGrammarParser.FRPEqualContext) {
            ParseTree rp1 = tree.getChild(0);
            ParseTree rp2 = tree.getChild(2);
            return EngineUtilities.eq((List<Node>) relativePath(rp1, node),
                    (List<Node>) relativePath(rp2, node));
        } else if (tree instanceof XGrammarParser.FRPIdenticalContext) {
            ParseTree rp1 = tree.getChild(0);
            ParseTree rp2 = tree.getChild(2);
            return EngineUtilities.is(relativePath(rp1, node), relativePath(rp2, node));
        } else if (tree instanceof XGrammarParser.FStringEqualContext) {
            ParseTree rp1 = tree.getChild(0);
            ParseTree rp2 = tree.getChild(2);
            return EngineUtilities.eq(relativePath(rp1, node), rp2.getText().replaceAll("\"", ""));
        } else if (tree instanceof XGrammarParser.FParanthesesContext) {
            return filter(tree.getChild(1), node);
        } else if (tree instanceof XGrammarParser.FAndContext) {
            ParseTree f1 = tree.getChild(0);
            ParseTree f2 = tree.getChild(2);
            return filter(f1, node) && filter(f2, node);
        } else if (tree instanceof XGrammarParser.FOrContext) {
            ParseTree f1 = tree.getChild(0);
            ParseTree f2 = tree.getChild(2);
            return filter(f1, node) || filter(f2, node);
        } else if (tree instanceof XGrammarParser.FNotContext) {
            return !filter(tree.getChild(1), node);
        } else {
            throw new IllegalArgumentException("Filter could not be parsed.");
        }
    }
}
