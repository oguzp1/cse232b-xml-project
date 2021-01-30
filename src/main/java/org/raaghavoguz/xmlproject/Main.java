package org.raaghavoguz.xmlproject;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.raaghavoguz.xmlproject.grammar.XGrammarLexer;
import org.raaghavoguz.xmlproject.grammar.XGrammarParser;
import org.raaghavoguz.xmlproject.grammar.XGrammarVisitor;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void traverse(ParseTree tree, XGrammarVisitor<Object> visitor, Document doc) {
        Element documentElement = doc.getDocumentElement();
        Object o = visitor.visit(tree);


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
    }

    public static void main(String[] args) {
        try{
            String source = args[1];
            CharStream cs = fromFileName(source);
            XGrammarLexer lexer = new XGrammarLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            XGrammarParser parser = new XGrammarParser(token);
            ParseTree tree = parser.ap();
            System.out.println(tree.getChild(0));

            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);

            File inputFile = new File("./j_caesar.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
