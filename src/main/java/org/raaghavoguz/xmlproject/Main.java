package org.raaghavoguz.xmlproject;

import org.raaghavoguz.xmlproject.grammar.XGrammarParser;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static String getResults(String fileName) {
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            Document document = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder()
                    .newDocument();

            XGrammarParser parser = QueryRewriter.getOptimizedQuery(fileName);

            // Should be only one element if xquery
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

            for (Node n : EngineFunctions.xQuery(document, new Context(), parser.xq())) {
                DOMSource source = new DOMSource(n);
                transformer.transform(source, new StreamResult(outputStream));
                outputStream.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));
            }

            return outputStream.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.print(getResults(args[0]));
    }
}
