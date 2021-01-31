package org.raaghavoguz.xmlproject;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.raaghavoguz.xmlproject.grammar.XGrammarParser;
import org.w3c.dom.Node;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String line;
            while ((line = br.readLine()) != null) {
                CharStream cs = CharStreams.fromString(line);
                XGrammarParser parser = EngineUtilities.parseCharStream(cs);
                //System.out.println(tree.getChild(0));
                // System.out.println(doc.getDocumentElement().getAttribute("color"));
                // System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
                Transformer transformer = TransformerFactory.newInstance()
                        .newTransformer();
                System.out.println("Query: " + line);
                List<?> resultList = EngineFunctions.absolutePath(parser.ap());
                for (Object o : resultList) {
                    if (o instanceof Node) {
                        DOMSource source = new DOMSource((Node) o);
                        StreamResult result = new StreamResult(System.out);
                        transformer.transform(source, result);
                    } else {
                        System.out.println(o);
                    }
                }
                System.out.println("\n");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
