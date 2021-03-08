package org.raaghavoguz.xmlproject.rewriter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class JoinMap extends HashMap<JoinKey, List<JoinCondition>> {
    Map<Integer, Integer> getJoinCounts() {
        Map<Integer, Integer> joinCounts = new HashMap<>();

        this.keySet().forEach(key -> {
            int lastCount = joinCounts.getOrDefault(key.getLeftIndex(), 0);
            joinCounts.put(key.getLeftIndex(), lastCount + 1);
        });

        return joinCounts;
    }

    Map<Integer, List<JoinKey>> getAssociatedJoins() {
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
