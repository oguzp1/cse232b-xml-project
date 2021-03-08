package org.raaghavoguz.xmlproject.rewriter;

import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.raaghavoguz.xmlproject.EngineUtilities;
import org.raaghavoguz.xmlproject.grammar.XGrammarParser;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
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

    private static ClosureList getTransitiveClosures(ParseTree forClause) {
        ClosureList transitiveClosures = new ClosureList();

        for (int i = 1; i < forClause.getChildCount(); i += 4) {
            String variable = forClause.getChild(i).getText().substring(1);
            ParseTree xq = forClause.getChild(i + 2);

            if (xq instanceof XGrammarParser.XQAbsoluteContext) {
                HashSet<String> closure = new HashSet<>();
                closure.add(variable);
                transitiveClosures.add(closure);
            } else {
                String requiredVariable = xq.getText().split("/")[0].substring(1).trim();
                transitiveClosures.getMatchingSet(requiredVariable).add(variable);
            }
        }

        return transitiveClosures;
    }

    private static List<List<String>> getDependentExpressions(ClosureList transitiveClosures,
                                                              ParseTree forClause) {
        List<List<String>> dependentExpressions = IntStream.range(0, transitiveClosures.size())
                .mapToObj(ArrayList<String>::new)
                .collect(Collectors.toList());

        for (int i = 1; i < forClause.getChildCount(); i += 4) {
            String variable = forClause.getChild(i).getText().substring(1);
            String iterationStatement = IntStream.range(i, i + 3)
                    .mapToObj(j -> forClause.getChild(j).getText())
                    .collect(Collectors.joining(" "));

            int index = transitiveClosures.getMatchingSetIndex(variable);

            dependentExpressions.get(index).add(iterationStatement);
        }

        return dependentExpressions;
    }

    private static Map<String, List<Integer>> getConditionDependencies(ClosureList transitiveClosures,
                                                                       ParseTree whereClause) {
        Map<String, List<Integer>> conditionDependencies = new HashMap<>();

        for (String cond : whereClause.getChild(1).getText().split("\\s+and\\s+")) {
            List<Integer> indexes = new ArrayList<>();

            for (String part : cond.split("\\s+(eq | =)\\s+")) {
                if (part.startsWith("$"))
                    indexes.add(transitiveClosures.getMatchingSetIndex(part.substring(1)));
            }

            conditionDependencies.put(cond, indexes);
        }

        return conditionDependencies;
    }

    private static Map<Integer, List<String>> getSingleVariableConditions(Map<String, List<Integer>> conditionDependencies) {
        Map<Integer, List<String>> singleVariableConditions = new HashMap<>();

        conditionDependencies.entrySet().stream()
                .filter(e -> e.getValue().size() == 1)
                .forEach(e -> {
                    singleVariableConditions.putIfAbsent(e.getValue().get(0), new ArrayList<>());
                    singleVariableConditions.get(e.getValue().get(0)).add(e.getKey());
                });

        return singleVariableConditions;
    }

    private static JoinMap getJoinConditions(Map<String, List<Integer>> conditionDependencies) {
        JoinMap joinMap = new JoinMap();

        conditionDependencies.entrySet().stream()
                .filter(e -> e.getValue().size() > 1)
                .forEach(e -> {
                    JoinKey jk = new JoinKey(e.getValue().get(0), e.getValue().get(1));
                    joinMap.putIfAbsent(jk, new ArrayList<>());
                    joinMap.get(jk).add(new JoinCondition(e.getKey()));
                });

        return joinMap;
    }

    private static List<String> getFWRExpressions(List<List<String>> dependentExpressions,
                                                  Map<Integer, List<String>> singleVariableConditions) {

        List<String> fwrExpressions = new ArrayList<>();

        for (int i = 0; i < dependentExpressions.size(); i++) {
            List<String> deSet = dependentExpressions.get(i);
            List<String> condSet = singleVariableConditions.get(i);

            String fwrExpression = "for " + String.join(", ", deSet);

            if (!condSet.isEmpty())
                fwrExpression += "where " + String.join(" and ", condSet);

            fwrExpression += "return <tuple>{" +
                    deSet.stream()
                            .map(exp -> {
                                String variable = exp.split("\\$")[1].split("\\s+")[0];
                                return "<" + variable + ">{$" + variable + "}</" + variable + ">";
                            })
                            .collect(Collectors.joining(" ")) +
                    "}</tuple>";

            fwrExpressions.add(fwrExpression);
        }

        return fwrExpressions;
    }

    private static List<JoinKey> getJoinOrder(List<String> fwrExpressions, JoinMap joinMap) {
        /*
         * Assumptions:
         *  + non-join where clauses are selective, and produce small "tables"
         *  + non-join where clauses are pushed down on the leaves of the join tree (if they exist)
         *  + the branches only perform joins, no further filtering
         * Heuristic:
         *  + fwr expressions with "where" will produce small tables,
         *    and any consequent join of these tables will hopefully produce smaller tables
         *  + we would like to get the most "reduced" joins in terms of size,
         *    i.e. we should trade join count for better runtime in each join
         *  + therefore, we start from "less central" fwr expressions with non-join where filters,
         *    i.e. we first pick filtered expressions that are involved in the minimum number of joins
         */
        Map<Integer, Integer> joinCounts = joinMap.getJoinCounts();
        Map<Integer, List<JoinKey>> associatedJoins = joinMap.getAssociatedJoins();

        List<Integer> expressionOrder = IntStream.range(0, fwrExpressions.size()).boxed()
                .sorted(Comparator.comparingInt(joinCounts::get))
                .sorted(Comparator.comparing(i -> !fwrExpressions.get(i).contains("where")))
                .collect(Collectors.toList());

        // order is important
        LinkedHashSet<JoinKey> keyOrder = new LinkedHashSet<>();
        expressionOrder.forEach(i -> keyOrder.addAll(associatedJoins.get(i)));

        return new ArrayList<>(keyOrder);
    }

    private static String getJoinClause(List<String> fwrExpressions, JoinMap joinMap) {
        List<JoinKey> joinOrder = getJoinOrder(fwrExpressions, joinMap);

        JoinTracker tracker = new JoinTracker(fwrExpressions);

        for (JoinKey jk : joinOrder) {
            List<JoinCondition> lrConditions = joinMap.get(jk);
            List<JoinCondition> rlConditions = joinMap.get(jk.invert());

            List<String> leftVariables = lrConditions.stream()
                    .map(JoinCondition::getLeftVariable)
                    .collect(Collectors.toList());
            List<String> rightVariables = lrConditions.stream()
                    .map(JoinCondition::getRightVariable)
                    .collect(Collectors.toList());

            leftVariables.addAll(rlConditions.stream()
                    .map(JoinCondition::getRightVariable)
                    .collect(Collectors.toList()));
            rightVariables.addAll(rlConditions.stream()
                    .map(JoinCondition::getLeftVariable)
                    .collect(Collectors.toList()));

            String leftQuery = tracker.getJoinedString(jk.getLeftIndex());
            String rightQuery = tracker.getJoinedString(jk.getRightIndex());

            String joinedString = "join( " +
                    leftQuery + ", " +
                    rightQuery + ", " +
                    "[" + String.join(", ", leftVariables) + "], " +
                    "[" + String.join(", ", rightVariables) + "] )";

            tracker.registerJoin(jk, joinedString);
        }

        return tracker.getJoinedString(0);
    }

    private static String optimizeQuery(List<String> fwrExpressions,
                                        JoinMap joinMap,
                                        ParseTree returnClause) {

        String forClause = "for $tuple in " + getJoinClause(fwrExpressions, joinMap);
        String modifiedReturn = returnClause.getText().replaceAll("\\$", "$tuple/");

        return forClause + " " + modifiedReturn;
    }

    private static void writeOptimizedQuery(String query, String fileName) throws IOException {
        String fileNameWithoutExtension = fileName;

        if (fileName.contains("."))
            fileNameWithoutExtension = fileName.substring(0, fileName.lastIndexOf("."));

        Files.write(Paths.get(fileNameWithoutExtension + "_optimized.txt"),
                query.getBytes(StandardCharsets.UTF_8));
    }

    public static XGrammarParser getOptimizedQuery(String fileName) throws IOException {
        String query = new String(Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8);
        XGrammarParser parser = EngineUtilities.parseString(query);

        if (!isSimpleQuery(query))
            return parser;

        ParseTree tree = parser.xq();
        ParseTree forClause = tree.getChild(0);
        ParseTree whereClause = tree.getChild(1);
        ParseTree returnClause = tree.getChild(2);

        ClosureList transitiveClosures = getTransitiveClosures(forClause);

        if (transitiveClosures.size() == 1)
            return parser;

        List<List<String>> dependentExpressions = getDependentExpressions(transitiveClosures, forClause);

        Map<String, List<Integer>> conditionDependencies = getConditionDependencies(transitiveClosures, whereClause);
        Map<Integer, List<String>> singleVariableConditions = getSingleVariableConditions(conditionDependencies);
        JoinMap joinMap = getJoinConditions(conditionDependencies);

        List<String> fwrExpressions = getFWRExpressions(dependentExpressions, singleVariableConditions);

        String optimizedQuery = optimizeQuery(fwrExpressions, joinMap, returnClause);

        writeOptimizedQuery(optimizedQuery, fileName);

        return EngineUtilities.parseString(optimizedQuery);
    }
}
