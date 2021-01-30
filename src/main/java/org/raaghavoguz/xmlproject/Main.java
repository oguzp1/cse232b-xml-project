package org.raaghavoguz.xmlproject;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.raaghavoguz.xmlproject.grammar.XGrammarLexer;
import org.raaghavoguz.xmlproject.grammar.XGrammarParser;
import org.raaghavoguz.xmlproject.grammar.XGrammarVisitor;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void traverse(ParseTree tree, XGrammarVisitor<Object> visitor, Document doc) {
        Element documentElement = doc.getDocumentElement();
        Object o = visitor.visit(tree);


    }

    public static List<?> absolutePath(ParseTree tree) {
        Document doc = null;
        try {
            String fname=tree.getChild(2).toString();
            File inputFile = new File(fname);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();



        } catch (Exception e) {
            e.printStackTrace();
        }

        if (tree instanceof XGrammarParser.AbsoluteImmediateContext) {
            return relativePath(tree.getChild(5),doc.getDocumentElement());
        } else {
            return relativePath(tree.getChild(5),doc.getDocumentElement());
        }

    }

    public static List<?> relativePath(ParseTree tree, Element element) {
       //System.out.println(tree.getClass().getCanonicalName());
        if (tree instanceof XGrammarParser.ExpTagNameContext) {
           // System.out.println();
            String tagName = tree.getChild(0).getText();

            NodeList nodeList = element.getChildNodes();

            List<Node> elementList = new ArrayList<>();
            for (int i=0; i<nodeList.getLength();i++) {
                if(nodeList.item(i).getNodeName().equals(tagName)) {
                    elementList.add(nodeList.item(i));
                }
            }

            return elementList;
        } else if (tree instanceof XGrammarParser.ExpStarContext) {
            NodeList nodeList = element.getChildNodes();

            List<Node> elementList = new ArrayList<>();
            for (int i=0; i<nodeList.getLength();i++) {
                elementList.add(nodeList.item(i));
            }

            return elementList;
        } else if (tree instanceof XGrammarParser.ExpDotContext) {
            List<Node> elementList = new ArrayList<>();

            elementList.add(element);

            return elementList;
        } else if (tree instanceof XGrammarParser.ExpDotDotContext) {
            List<Node> elementList = new ArrayList<>();

            elementList.add(element.getParentNode());

            return elementList;
        } else if (tree instanceof XGrammarParser.ExpTextContext) {
            List<String> elementList = new ArrayList<>();
            elementList.add(element.getTextContent());
            return elementList;
        } else if (tree instanceof XGrammarParser.ExpAttnameContext) {
            ParseTree attribute = tree.getChild(1);
            List<String> elementList = new ArrayList<>();
            elementList.add(element.getAttribute(attribute.toString()));
            return elementList;
        } else if (tree instanceof XGrammarParser.ExpRPbracketsContext) {
            return relativePath(tree.getChild(1), element);
        } else if (tree instanceof XGrammarParser.ExpRPDir1Context) {
            ParseTree rp1 = tree.getChild(0);
            ParseTree rp2 = tree.getChild(2);
            List<Node> x = (List<Node>) relativePath(rp1, element);
            List<Node> y = new ArrayList<>();
            for (Node s: x) {
                y.addAll((List<Node>) relativePath(rp2, (Element) s));
            }

            return new ArrayList<>(new HashSet<>(y));
        }  else if (tree instanceof XGrammarParser.ExpRPDir2Context) {
            ParseTree rp1 = tree.getChild(0);
            ParseTree rp2 = tree.getChild(2);
            List<Node> x = (List<Node>) relativePath(rp1, element);
            List<Node> y = new ArrayList<>();
            for (Node s: x) {
                y.addAll((List<Node>) relativePath(rp2, (Element) s));
            }
            y = new ArrayList<>(new HashSet<>(y));


        } else if (tree instanceof XGrammarParser.ExpCatContext) {
            ParseTree rp1 = tree.getChild(0);
            ParseTree rp2 = tree.getChild(2);
            List<Node> x = (List<Node>) relativePath(rp1, element);
            List<Node> y = (List<Node>) relativePath(rp2, element);
            x.addAll(y);
            return x;
        } else if (tree instanceof XGrammarParser.ExpRPfilterContext) {
            ParseTree rp1 = tree.getChild(0);
            ParseTree f = tree.getChild(2);
            List<Node> x = (List<Node>) relativePath(rp1, element);
            List<Node> y = new ArrayList<>();
            for (Node s: x) {
                y.addAll((List<Node>) filter(f, (Element) s));
            }
            return y;
        }
        return null;
    }

    public static List<?> filter(ParseTree tree, Element element) {
        return null;
    }

    public static List<Element> walk(Object o, Element element) {
        String tagName = element.getTagName();

        if (tagName == null) {
            return Collections.singletonList(element);
        }

        switch (tagName) {
            case "ap":
                break;

            case "rp":
                break;

            case "f":
                break;

            default:
                return Collections.singletonList(element);
        }
        return null;
    }

    public static void main(String[] args) {
        try{
            String source = "test.txt";
            CharStream cs = fromFileName(source);
            XGrammarLexer lexer = new XGrammarLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            XGrammarParser parser = new XGrammarParser(token);
            ParseTree tree = parser.ap();
            //System.out.println(tree.getChild(0));

            File inputFile = new File("./j_caesar.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
           // System.out.println(doc.getDocumentElement().getAttribute("color"));
           // System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            System.out.println(absolutePath(tree)
                    .stream()
                    .map(r -> {
                        if (r instanceof Node) {
                            return ((Node) r).getTextContent();
                        } else {
                            return r;
                        }
                    })
                    .collect(Collectors.toList()));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
