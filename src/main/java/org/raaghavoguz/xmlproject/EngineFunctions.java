package org.raaghavoguz.xmlproject;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;
import org.raaghavoguz.xmlproject.grammar.XGrammarParser;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
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
                        .flatMap(n -> Stream.of(relativePath(rp2, (Node) n)))
                        .collect(Collectors.toList())
        );
    }

    private static List<?> relativeDirRecursive(ParseTree rp1, ParseTree rp2, Node node) {
        return EngineUtilities.unique(
                Trees.getDescendants(rp1).stream()
                        .flatMap(d -> Stream.of(relativeDir(d, rp2, node)))
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

        Element root = EngineUtilities.root(tree.getChild(2).getText());
        ParseTree rp = tree.getChild(5);

        if (tree instanceof XGrammarParser.APDirContext) {
            return relativePath(tree.getChild(5), root);
        } else if (tree instanceof XGrammarParser.APDirRecursiveContext) {
            CharStream cs = CharStreams.fromString(".");
            XGrammarParser parser = EngineUtilities.parseCharStream(cs);
            ParseTree dot = parser.rp();

            return relativeDirRecursive(dot, rp, root);
        } else {
            throw new IllegalArgumentException("Absolute Path could not be parsed.");
        }
    }

    public static List<?> relativePath(ParseTree tree, Node node) {
        //System.out.println(tree.getClass().getCanonicalName());
        if (tree instanceof XGrammarParser.RPTagNameContext) {
            // System.out.println();
            String tagName = tree.getChild(0).getText();
            return EngineUtilities.children(node).stream()
                    .filter(n -> tagName.equals(n.getNodeName()))
                    .collect(Collectors.toList());
        } else if (tree instanceof XGrammarParser.RPStarContext) {
            return EngineUtilities.children(node);
        } else if (tree instanceof XGrammarParser.RPCurrentDirContext) {
            return Collections.singletonList(node);
        } else if (tree instanceof XGrammarParser.RPParentDirContext) {
            List<Node> elementList = new ArrayList<>();
            Optional.ofNullable(node.getParentNode())
                    .ifPresent(elementList::add);
            return elementList;
        } else if (tree instanceof XGrammarParser.RPTextContext) {
            List<String> elementList = new ArrayList<>();
            elementList.add(node.getTextContent());
            return elementList;
        } else if (tree instanceof XGrammarParser.RPAttNameContext) {
            ParseTree attribute = tree.getChild(1);
            List<String> elementList = new ArrayList<>();
            elementList.add(node.getAttributes().getNamedItem(attribute.toString()).getNodeValue());
            return elementList;
        } else if (tree instanceof XGrammarParser.RPParanthesesContext) {
            return relativePath(tree.getChild(1), node);
        } else if (tree instanceof XGrammarParser.RPDirContext) {
            ParseTree rp1 = tree.getChild(0);
            ParseTree rp2 = tree.getChild(2);
            return relativeDir(rp1, rp2, node);
        }  else if (tree instanceof XGrammarParser.RPDirRecursiveContext) {
            ParseTree rp1 = tree.getChild(0);
            ParseTree rp2 = tree.getChild(2);
            return relativeDirRecursive(rp1, rp2, node);
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
        if (tree instanceof XGrammarParser.FRPContext) {
            return !relativePath(tree, node).isEmpty();
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
            return EngineUtilities.eq(relativePath(rp1, node), rp2.getText());
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
