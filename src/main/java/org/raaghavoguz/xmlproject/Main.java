package org.raaghavoguz.xmlproject;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.raaghavoguz.xmlproject.grammar.XGrammarParser;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try{
            String query = new String(Files.readAllBytes(Paths.get(args[0])), StandardCharsets.UTF_8);
            CharStream cs = CharStreams.fromString(query);
            XGrammarParser parser = EngineUtilities.parseCharStream(cs);

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            Document document = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder()
                    .newDocument();

            Node n = EngineFunctions.xQuery(document, new Context(), parser.xq()).get(0);

            DOMSource source = new DOMSource(n);
            StreamResult result = new StreamResult(System.out);
            transformer.transform(source, result);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
