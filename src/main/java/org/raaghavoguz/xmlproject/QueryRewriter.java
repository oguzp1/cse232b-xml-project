package org.raaghavoguz.xmlproject;

import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
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

        Map<String, List<Integer>> conditionDependencies = new HashMap<>();

        String[] whereQuery = postOrder(whereClause).split("\\s+");
        for (int x = 2; x < whereQuery.length; x += 4) {
            // index 2 is first eq, and every 4th string is eq
            String l = whereQuery[x - 1];
            String r = whereQuery[x + 1];
            int lval = -1, rval = -1;

            for (int i = 0; i < dependentExpressions.size(); i++) {
                if (dependentExpressions.get(i).stream().anyMatch(str -> str.contains(l)))
                    lval = i;
                if (dependentExpressions.get(i).stream().anyMatch(str -> str.contains(r)))
                    rval = i;
            }

            List<Integer> positions = new ArrayList<>();
            positions.add(lval);
            if (rval > -1)
                positions.add(rval);

            conditionDependencies.put(l + " eq " + r, positions);
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

    private static JoinMap getJoinConditions(Map<String, List<Integer>> conditionDependencies) {
        JoinMap joinMap = new JoinMap();

        conditionDependencies.forEach((key, valueList) -> {
            JoinKey jk = new JoinKey(valueList.get(0), valueList.get(1));
            joinMap.putIfAbsent(jk, new ArrayList<>());
            joinMap.get(jk).add(new JoinCondition(key));
        });

        return joinMap;
    }

    private static List<String> getFWRExpressions(List<List<String>> dependentExpressions,
                                                  List<List<String>> singleVariableConditions) {

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
        // TODO: construct tree of joins
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
        JoinMap joinMap = getJoinConditions(conditionDependencies);

        List<String> fwrExpressions = getFWRExpressions(dependentExpressions, singleVariableConditions);

        String forClause = "for $tuple in " + getJoinClause(fwrExpressions, joinMap);
        String modifiedReturn = returnClause.toString().replaceAll("\\$", "$tuple/");

        return forClause + modifiedReturn;
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

        List<List<String>> dependentExpressions = getDependentExpressions(forClause);

        if (dependentExpressions.size() == 1)
            return parser;

        Map<String, List<Integer>> conditionDependencies = getConditionDependencies(whereClause, dependentExpressions);
        String optimizedQuery = optimizeQuery(dependentExpressions, conditionDependencies, returnClause);

        writeOptimizedQuery(optimizedQuery, fileName);

        return EngineUtilities.parseString(optimizedQuery);
    }

    private static final class JoinKey {
        private final int leftIndex;
        private final int rightIndex;

        private JoinKey(int leftIndex, int rightIndex) {
            this.leftIndex = leftIndex;
            this.rightIndex = rightIndex;
        }

        private int getLeftIndex() {
            return leftIndex;
        }

        private int getRightIndex() {
            return rightIndex;
        }

        private JoinKey invert() {
            return new JoinKey(this.rightIndex, this.leftIndex);
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof JoinKey &&
                    this.leftIndex == ((JoinKey) obj).leftIndex &&
                    this.rightIndex == ((JoinKey) obj).rightIndex;
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.leftIndex, this.rightIndex);
        }
    }

    private static final class JoinCondition {
        private final String leftVariable;
        private final String rightVariable;

        private JoinCondition(String key) {
            String[] variables = key.split("\\$");

            this.leftVariable = variables[1].split("\\s+")[0];
            this.rightVariable = variables[2].split("\\s+")[0];
        }

        private String getLeftVariable() {
            return leftVariable;
        }

        private String getRightVariable() {
            return rightVariable;
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.leftVariable, this.rightVariable);
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof JoinCondition &&
                    this.leftVariable.equals(((JoinCondition) obj).leftVariable) &&
                    this.rightVariable.equals(((JoinCondition) obj).rightVariable);
        }
    }

    private static final class JoinMap extends HashMap<JoinKey, List<JoinCondition>> {
        private Map<Integer, Integer> getJoinCounts() {
            Map<Integer, Integer> joinCounts = new HashMap<>();

            this.keySet().forEach(key -> {
                int lastCount = joinCounts.getOrDefault(key.getLeftIndex(), 0);
                joinCounts.put(key.getLeftIndex(), lastCount + 1);
            });

            return joinCounts;
        }

        private Map<Integer, List<JoinKey>> getAssociatedJoins() {
            Map<Integer, List<JoinKey>> associatedJoins = new HashMap<>();

            this.keySet().forEach(key -> {
                associatedJoins.putIfAbsent(key.getLeftIndex(), new ArrayList<>());
                associatedJoins.putIfAbsent(key.getRightIndex(), new ArrayList<>());

                associatedJoins.get(key.getLeftIndex()).add(key);
                associatedJoins.get(key.getRightIndex()).add(key);
            });

            return associatedJoins;
        }
    }

    private static final class JoinTracker {
        private final Map<Integer, String> joinedMap;
        private final List<Set<Integer>> joinList;

        private JoinTracker(List<String> stringList) {
            this.joinedMap = IntStream.range(0, stringList.size()).boxed()
                    .collect(Collectors.toMap(i -> i, stringList::get));

            this.joinList = IntStream.range(0, stringList.size())
                    .mapToObj(i -> {
                        Set<Integer> newSet = new HashSet<>();
                        newSet.add(i);
                        return newSet;
                    })
                    .collect(Collectors.toList());
        }

        private int findIndexInJoined(int index) {
            for (int i = 0; i < this.joinList.size(); i++) {
                if (this.joinList.get(i).contains(index))
                    return i;
            }
            throw new IllegalStateException("Input index should always be within one of the sets.");
        }

        private void registerJoin(JoinKey joinKey, String joinedString) {
            int leftSetIndex = findIndexInJoined(joinKey.getLeftIndex());
            int rightSetIndex = findIndexInJoined(joinKey.getRightIndex());

            Set<Integer> leftSet = joinList.get(leftSetIndex);

            leftSet.addAll(joinList.get(rightSetIndex));
            joinList.remove(rightSetIndex);

            leftSet.forEach(i -> this.joinedMap.put(i, joinedString));
        }

        private String getJoinedString(int index) {
            return this.joinedMap.get(index);
        }
    }
}
