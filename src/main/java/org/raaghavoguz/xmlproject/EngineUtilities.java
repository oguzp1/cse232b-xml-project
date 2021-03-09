package org.raaghavoguz.xmlproject;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.raaghavoguz.xmlproject.grammar.XGrammarLexer;
import org.raaghavoguz.xmlproject.grammar.XGrammarParser;
import org.raaghavoguz.xmlproject.grammar.XSimpleGrammarLexer;
import org.raaghavoguz.xmlproject.grammar.XSimpleGrammarParser;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EngineUtilities {
    private EngineUtilities() {
    }

    public static boolean isTerminal(Node node) {
        short nodeType = node.getNodeType();
        return (nodeType == Node.TEXT_NODE ||
                nodeType == Node.ATTRIBUTE_NODE ||
                nodeType == Node.CDATA_SECTION_NODE ||
                nodeType == Node.COMMENT_NODE ||
                nodeType == Node.NOTATION_NODE);
    }

    public static boolean isNonTerminal(Node node) {
        return !isTerminal(node);
    }

    public static Node root(String fileName) throws ParserConfigurationException, SAXException, IOException {
        File inputFile = new File(fileName);

        Document document = DocumentBuilderFactory.newInstance()
                .newDocumentBuilder()
                .parse(inputFile);

        Element root = document.getDocumentElement();
        root.normalize();

        return root.getParentNode();
    }

    public static List<Node> children(Node node) {
        NodeList nodeList = node.getChildNodes();
        return IntStream.range(0, nodeList.getLength())
                .mapToObj(nodeList::item)
                .collect(Collectors.toList());
    }

    public static List<Node> descendants(Node node) {
        List<Node> descList = new ArrayList<>();
        descList.add(node);

        if (isNonTerminal(node)) {
            children(node).stream()
                    .map(EngineUtilities::descendants)
                    .forEach(descList::addAll);
        }

        return descList;
    }

    public static List<Node> parent(Node node) {
        List<Node> parentList = new ArrayList<>();
        Optional.ofNullable(node.getParentNode())
                .ifPresent(parentList::add);
        return parentList;
    }

    public static Optional<String> tag(Node node) {
        return Optional.ofNullable(node.getNodeName());
    }

    public static Optional<String> text(Node node) {
        return Optional.ofNullable(node.getNodeValue());
    }

    public static List<Node> unique(List<Node> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static List<Node> attrib(Node node, String attName) {
        List<Node> attList = new ArrayList<>();

        if (isNonTerminal(node)) {
            Optional.ofNullable(node.getAttributes())
                    .flatMap(attribs -> Optional.ofNullable(attribs.getNamedItem(attName)))
                    .ifPresent(attList::add);
        }

        return attList;
    }

    public static boolean is(List<Node> list1, List<Node> list2) {
        for (Node n1 : list1) {
            for (Node n2 : list2) {
                if (n1 == n2)
                    return true;
            }
        }
        return false;
    }

    public static boolean eq(List<Node> list1, List<Node> list2) {
        for (Node n1 : list1) {
            for (Node n2 : list2) {
                if (!tag(n1).equals(tag(n2)))
                    continue;

                if (!text(n1).equals(text(n2)))
                    continue;

                List<Node> children1 = children(n1);
                List<Node> children2 = children(n2);

                if (children1.size() != children2.size())
                    continue;

                if (children1.isEmpty() || eq(children1, children2))
                    return true;
            }
        }
        return false;
    }

    public static boolean eq(List<Node> list, String str) {
        for (Node n : list) {
            if (text(n).equals(Optional.of(str)))
                return true;
        }
        return false;
    }

    public static XGrammarParser parseString(String s) {
        CharStream cs = CharStreams.fromString(s);
        XGrammarLexer lexer = new XGrammarLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        return new XGrammarParser(token);
    }

    public static Element makeElement(Document document, String tagName, List<Node> children) {
        Element element = document.createElement(tagName);
        children.stream()
                .map(n -> document.importNode(n, true))
                .forEach(element::appendChild);
        return element;
    }

    public static Text makeText(Document document, String text) {
        return document.createTextNode(text);
    }
}
