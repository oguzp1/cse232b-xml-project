package org.raaghavoguz.xmlproject;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.raaghavoguz.xmlproject.grammar.XGrammarLexer;
import org.raaghavoguz.xmlproject.grammar.XGrammarParser;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EngineUtilities {
    private EngineUtilities() { }

    public static Element root(String fileName) throws ParserConfigurationException, SAXException, IOException {
        File inputFile = new File(fileName);

        Document document = DocumentBuilderFactory.newInstance()
                .newDocumentBuilder()
                .parse(inputFile);

        Element root = document.getDocumentElement();
        root.normalize();

        return root;
    }

    public static List<Node> children(Node node) {
        NodeList nodeList = node.getChildNodes();
        return IntStream.range(0, nodeList.getLength())
                .mapToObj(nodeList::item)
                .collect(Collectors.toList());
    }

    public static List<Node> parent(Node node) {
        List<Node> parentList = new ArrayList<>();
        Optional.ofNullable(node.getParentNode())
                .ifPresent(parentList::add);
        return parentList;
    }

    public static String tag(Node node) {
        return node.getNodeName();
    }

    public static String text(Node node) {
        return node.getNodeValue();
    }

    public static int childCount(Node node) {
        return node.getChildNodes().getLength();
    }

    public static List<?> unique(List<?> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static List<Node> attrib(Node node, String attName) {
        List<Node> attList = new ArrayList<>();
        Optional.ofNullable(node.getAttributes().getNamedItem(attName))
                .ifPresent(attList::add);
        return attList;
    }

    public static boolean is(List<?> list1, List<?> list2) {
        for (Object o1 : list1) {
            for (Object o2 : list2) {
                if (o1 == o2)
                    return true;
            }
        }
        return false;
    }

    public static boolean eq(List<? extends Node> list1, List<? extends Node> list2) {
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

                if (eq(children1, children2))
                    return true;
            }
        }
        return false;
    }

    public static boolean eq(List<?> list, String str) {
        for (Object o : list) {
            if (o.equals(str))
                return true;
        }
        return false;
    }

    public static XGrammarParser parseCharStream(CharStream cs) {
        XGrammarLexer lexer = new XGrammarLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        return new XGrammarParser(token);
    }
}
