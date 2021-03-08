package org.raaghavoguz.xmlproject;

import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.raaghavoguz.xmlproject.grammar.XGrammarParser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QueryRewriter {
    private QueryRewriter() { }

    private static boolean isSimpleQuery(String query) {
        try {
            EngineUtilities.parseSimpleString(query).xq();
            return true;
        } catch (RecognitionException e) {
            return false;
        }
    }

    private static List<Set<String>> getDependentExpressions(ParseTree forClause) {
        // TODO: start with setting ap path variables as 1-element sets,
        //  build upon the sets by appending variables that depend on previous sets
        List<List<String>> VarList=new ArrayList<>();
        List<List<String>> dependentExpressions=new ArrayList<>();
        for(int i=0;i<forClause.getChildCount();i++)
        {
            if(forClause.getChild(i) instanceof XGrammarParser.XqContext)
            {
                if(forClause.getChild(i).getChild(0) instanceof XGrammarParser.XQAbsoluteContext){
                    List<String> tempVar = new ArrayList<>();
                    List<String> tempString = new ArrayList<>();
                    tempVar.add(forClause.getChild(i-2).getText());
                    VarList.add(tempVar);
                    tempString.add(forClause.getChild(i-2).getText()+"in"+PostOrder(forClause.getChild(i)));
                    dependentExpressions.add(tempString);
                }
            }
        }
        for (int i=1;i<forClause.getChildCount();i+=4)
        {

            for(int j=0;j<dependentExpressions.size();j++)
            {
                if(dependentExpressions.get(j).contains(forClause.getChild(i+2).getChild(0).getChild(0).getText()))
                {
                        VarList.get(j).add(forClause.getChild(i).getText());
                        dependentExpressions.get(j).add(forClause.getChild(i-2).getText()+"in"+PostOrder(forClause.getChild(i)));
                }
            }

        }
        return dependentExpressions;
    }

    private static String PostOrder(ParseTree subtree) {
        String ans="";
        if(subtree.getChildCount()==0)
            ans=subtree.getText();
        for(int i=0;i<subtree.getChildCount();i++)
        {
            ans+=PostOrder(subtree.getChild(i));
        }
        return ans;
    }

    private static List<List<Integer>> getConditionDependencies(ParseTree whereClause) {
        // TODO: read the chain of EQ and AND conditions, identify the indexes of the sets their checks depend on

        return new ArrayList<>();
    }

    private static String optimizeQuery(List<Set<String>> dependentExpressions,
                                        List<List<Integer>> conditionDependencies,
                                        ParseTree returnClause) {
        // TODO: separate for clauses based on dependent expressions,
        //  write where statements based on conditions that depend on 1 set within the for clauses,
        //  write join statements using conditions that depend on 2 sets (in any order for now),
        //  replace every $ with $tuple/ in the return clause string,
        //  concatenate everything
        return "";
    }

    private static void writeOptimizedQuery(String query) {
        // TODO
    }

    public static XGrammarParser getOptimizedQuery(String query) {
        XGrammarParser parser = EngineUtilities.parseString(query);

        if (!isSimpleQuery(query))
            return parser;

        ParseTree tree = parser.xq();
        ParseTree forClause = tree.getChild(0);
        ParseTree whereClause = tree.getChild(1);
        ParseTree returnClause = tree.getChild(2);

        List<Set<String>> dependentExpressions = getDependentExpressions(forClause);
        List<List<Integer>> conditionDependencies = getConditionDependencies(whereClause);
        String optimizedQuery = optimizeQuery(dependentExpressions, conditionDependencies, returnClause);

        writeOptimizedQuery(optimizedQuery);

        return EngineUtilities.parseString(optimizedQuery);
    }


}
