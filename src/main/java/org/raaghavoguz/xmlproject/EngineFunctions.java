package org.raaghavoguz.xmlproject;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import org.raaghavoguz.xmlproject.grammar.XGrammarParser;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EngineFunctions {
    private EngineFunctions() { }

    private static List<Node> relativeDir(ParseTree rp1, ParseTree rp2, Node node) {
        return EngineUtilities.unique(
                relativePath(rp1, node).stream()
                        .filter(EngineUtilities::isNonTerminal)
                        .flatMap(n -> relativePath(rp2, n).stream())
                        .collect(Collectors.toList())
        );
    }

    private static List<Node> relativeDirRecursive(ParseTree rp1, ParseTree rp2, Node node) {
        return EngineUtilities.unique(
                relativePath(rp1, node).stream()
                        .flatMap(n -> EngineUtilities.descendants(n).stream())
                        .filter(EngineUtilities::isNonTerminal)
                        .flatMap(d -> relativePath(rp2, d).stream())
                        .collect(Collectors.toList())
        );
    }

    private static List<Node> relativeConcatenate(Node node, ParseTree... parseTrees) {
        return Arrays.stream(parseTrees)
                .flatMap(pt -> relativePath(pt, node).stream())
                .collect(Collectors.toList());
    }

    private static List<Node> relativeFilter(ParseTree rp1, ParseTree f, Node node) {
        return relativePath(rp1, node).stream()
                .filter(n -> filter(f, n))
                .collect(Collectors.toList());
    }

    public static List<Node> absolutePath(ParseTree tree) throws ParserConfigurationException,
            SAXException, IOException {

        Element root = EngineUtilities.root(tree.getChild(2).getText());
        ParseTree rp = tree.getChild(5);

        if (tree instanceof XGrammarParser.APDirContext) {
            return relativePath(rp, root);
        } else if (tree instanceof XGrammarParser.APDirRecursiveContext) {
            CharStream cs = CharStreams.fromString(".");
            XGrammarParser parser = EngineUtilities.parseCharStream(cs);
            ParseTree dot = parser.rp();

            return relativeDirRecursive(dot, rp, root);
        } else {
            throw new IllegalArgumentException("Absolute Path could not be parsed.");
        }
    }

    public static List<Node> relativePath(ParseTree tree, Node node) {
        if (tree instanceof XGrammarParser.RPTagNameContext) {
            String tagName = tree.getChild(0).getText();
            return EngineUtilities.children(node).stream()
                    .filter(EngineUtilities::isNonTerminal)
                    .filter(n -> tagName.equals(n.getNodeName()))
                    .collect(Collectors.toList());
        } else if (tree instanceof XGrammarParser.RPStarContext) {
            return EngineUtilities.children(node).stream()
                    .filter(EngineUtilities::isNonTerminal)
                    .collect(Collectors.toList());
        } else if (tree instanceof XGrammarParser.RPCurrentDirContext) {
            return Collections.singletonList(node);
        } else if (tree instanceof XGrammarParser.RPParentDirContext) {
            return EngineUtilities.parent(node);
        } else if (tree instanceof XGrammarParser.RPTextContext) {
            return EngineUtilities.children(node).stream()
                    .filter(n -> n.getNodeType() == Node.TEXT_NODE)
                    .collect(Collectors.toList());
        } else if (tree instanceof XGrammarParser.RPAttNameContext) {
            String attName = tree.getChild(1).toString();
            return EngineUtilities.attrib(node, attName);
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
            return !relativePath(tree.getChild(0), node).isEmpty();
        } else if (tree instanceof XGrammarParser.FRPEqualContext) {
            ParseTree rp1 = tree.getChild(0);
            ParseTree rp2 = tree.getChild(2);
            return EngineUtilities.eq(relativePath(rp1, node), relativePath(rp2, node));
        } else if (tree instanceof XGrammarParser.FRPIdenticalContext) {
            ParseTree rp1 = tree.getChild(0);
            ParseTree rp2 = tree.getChild(2);
            return EngineUtilities.is(relativePath(rp1, node), relativePath(rp2, node));
        } else if (tree instanceof XGrammarParser.FStringEqualContext) {
            ParseTree rp = tree.getChild(0);
            String stringConstant = tree.getChild(2).getText().replaceAll("\"", "");
            return EngineUtilities.eq(relativePath(rp, node), stringConstant);
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
