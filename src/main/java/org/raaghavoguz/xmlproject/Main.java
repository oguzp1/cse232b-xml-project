package org.raaghavoguz.xmlproject;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.raaghavoguz.xmlproject.grammar.XGrammarParser;
import org.w3c.dom.Node;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader(args[0]));

            String line;
            while ((line = br.readLine()) != null) {
                CharStream cs = CharStreams.fromString(line);
                XGrammarParser parser = EngineUtilities.parseCharStream(cs);

                Transformer transformer = TransformerFactory.newInstance().newTransformer();
                transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");

                for (Node n : EngineFunctions.absolutePath(parser.ap())) {
                    DOMSource source = new DOMSource(n);
                    StreamResult result = new StreamResult(System.out);
                    transformer.transform(source, result);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
