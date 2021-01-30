package org.raaghavoguz.xmlproject;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.raaghavoguz.xmlproject.grammar.XGrammarLexer;
import org.raaghavoguz.xmlproject.grammar.XGrammarParser;
import org.w3c.dom.Node;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try{
            CharStream cs = CharStreams.fromFileName(args[0]);
            XGrammarParser parser = EngineUtilities.parseCharStream(cs);
            //System.out.println(tree.getChild(0));
            // System.out.println(doc.getDocumentElement().getAttribute("color"));
            // System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            System.out.println(EngineFunctions.absolutePath(parser.ap())
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
