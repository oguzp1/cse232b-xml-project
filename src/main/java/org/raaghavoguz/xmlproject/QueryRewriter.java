package org.raaghavoguz.xmlproject;

import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.raaghavoguz.xmlproject.grammar.XGrammarParser;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class QueryRewriter {
    private QueryRewriter() {
    }

    private static boolean isSimpleQuery(String query) {
        try {
            EngineUtilities.parseSimpleString(query).xq();
            return true;
        } catch (RecognitionException e) {
            return false;
        }
    }

    private static List<List<String>> getDependentExpressions(ParseTree forClause) {
        // TODO: start with setting ap path variables as 1-element sets,
        //  build upon the sets by appending variables that depend on previous sets
        List<List<String>> VarList = new ArrayList<>();
        List<List<String>> dependentExpressions = new ArrayList<>();
        for (int i = 0; i < forClause.getChildCount(); i++) {
            if (forClause.getChild(i) instanceof XGrammarParser.XqContext) {
                if (forClause.getChild(i).getChild(0) instanceof XGrammarParser.XQAbsoluteContext) {
                    List<String> tempVar = new ArrayList<>();
                    List<String> tempString = new ArrayList<>();
                    tempVar.add(forClause.getChild(i - 2).getText());
                    VarList.add(tempVar);
                    tempString.add(forClause.getChild(i - 2).getText() + "in" + postOrder(forClause.getChild(i)));
                    dependentExpressions.add(tempString);
                }
            }
        }
        for (int i = 1; i < forClause.getChildCount(); i += 4) {

            for (int j = 0; j < dependentExpressions.size(); j++) {
                if (dependentExpressions.get(j).contains(forClause.getChild(i + 2).getChild(0).getChild(0).getText())) {
                    VarList.get(j).add(forClause.getChild(i).getText());
                    dependentExpressions.get(j).add(forClause.getChild(i - 2).getText() + "in" + postOrder(forClause.getChild(i)));
                }
            }

        }
        return dependentExpressions;
    }

    private static String postOrder(ParseTree subtree) {
        StringBuilder ans = new StringBuilder();
        if (subtree.getChildCount() == 0)
            ans = new StringBuilder(subtree.getText());
        for (int i = 0; i < subtree.getChildCount(); i++) {
            ans.append(postOrder(subtree.getChild(i)));
        }
        return ans.toString();
    }

    private static Map<String, List<Integer>> getConditionDependencies(ParseTree whereClause, List<List<String>> dependentExpressions) {
        // TODO: read the chain of EQ and AND conditions, identify the indexes of the sets their checks depend on

        Map<String,List<Integer>> conditionDependencies=new HashMap<>();

        String[] whereQuery=postOrder(whereClause).split(" ");
        for(int x=2;x<whereQuery.length;x+=4)
        {
            // index 2 is first eq, and every 4th string is eq
            String l=whereQuery[x-1];
            String r=whereQuery[x+1];
            int lval=-1,rval=-1;

            for(int i=0;i<dependentExpressions.size();i++)
            {
                if(dependentExpressions.get(i).stream().anyMatch(str->str.contains(l)))
                    lval=i;
                if(dependentExpressions.get(i).stream().anyMatch(str->str.contains(r)))
                    rval=i;
            }

            List<Integer> positions=new ArrayList<>();
            positions.add(lval);
            if(rval>-1)
                positions.add(rval);

            conditionDependencies.put(l+" eq "+r,positions);
        }

        return conditionDependencies;
    }

    private static List<List<String>> getSingleVariableConditions(Map<String, List<Integer>> conditionDependencies,
                                                                  int size) {
        List<List<String>> singleVariableConditions = IntStream.range(0, size)
                .mapToObj(ArrayList<String>::new)
                .collect(Collectors.toList());

        conditionDependencies.entrySet().stream()
                .filter(e -> e.getValue().size() == 1)
                .forEach(e -> singleVariableConditions.get(e.getValue().get(0)).add(e.getKey()));

        return singleVariableConditions;
    }

    private static Map<String, List<Integer>> getJoinConditions(Map<String, List<Integer>> conditionDependencies) {
        return conditionDependencies.entrySet().stream()
                .filter(e -> e.getValue().size() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private static List<String> getFWRExpressions(List<List<String>> dependentExpressions,
                                                  List<List<String>> singleVariableConditions) {

        List<String> fwrExpressions = new ArrayList<>();

        for (int i = 0; i < dependentExpressions.size(); i++) {
            List<String> deSet = dependentExpressions.get(i);
            List<String> svConditions = singleVariableConditions.get(i);

            StringBuilder builder = new StringBuilder("for ");
            builder.append(String.join(", ", deSet));

            if (!svConditions.isEmpty())
                builder.append("where ").append(String.join(" and ", svConditions));

            builder.append("return <tuple> ");
            builder.append(deSet.stream()
                    .map(exp -> {
                        String variable = exp.split("\\s+")[0].substring(1);
                        return "<" + variable + ">{$" + variable + "}</" + variable + ">";
                    })
                    .collect(Collectors.joining(" ")));
            builder.append("</tuple>");

            fwrExpressions.add(builder.toString());
        }

        return fwrExpressions;
    }

    private static String getJoinClause(List<String> fwrExpressions, Map<String, List<Integer>> joinConditions) {
        // TODO: construct tree of joins
        return null;
    }

    private static String optimizeQuery(List<List<String>> dependentExpressions,
                                        Map<String, List<Integer>> conditionDependencies,
                                        ParseTree returnClause) {
        // TODO: separate for clauses based on dependent expressions,
        //  write where statements based on conditions that depend on 1 set within the for clauses,
        //  write join statements using conditions that depend on 2 sets (in any order for now),
        //  replace every $ with $tuple/ in the return clause string,
        //  concatenate everything

        int setCount = dependentExpressions.size();
        List<List<String>> singleVariableConditions = getSingleVariableConditions(conditionDependencies, setCount);
        Map<String, List<Integer>> joinConditions = getJoinConditions(conditionDependencies);

        List<String> fwrExpressions = getFWRExpressions(dependentExpressions, singleVariableConditions);

        String topJoinClause = getJoinClause(fwrExpressions, joinConditions);

        String fwClause = "for $tuple in " + topJoinClause;

        String modifiedReturn = returnClause.toString().replaceAll("\\$", "$tuple/");

        return fwClause + modifiedReturn;
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

        List<List<String>> dependentExpressions = getDependentExpressions(forClause);
        Map<String, List<Integer>> conditionDependencies = getConditionDependencies(whereClause,dependentExpressions);
        String optimizedQuery = optimizeQuery(dependentExpressions, conditionDependencies, returnClause);

        writeOptimizedQuery(optimizedQuery);

        return EngineUtilities.parseString(optimizedQuery);
    }


}
