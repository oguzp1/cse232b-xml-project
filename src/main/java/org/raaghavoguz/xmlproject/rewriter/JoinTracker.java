package org.raaghavoguz.xmlproject.rewriter;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class JoinTracker {
    private final Map<Integer, String> joinedMap;
    private final List<Set<Integer>> joinList;

    JoinTracker(List<String> stringList) {
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

    int findIndexInJoined(int index) {
        for (int i = 0; i < this.joinList.size(); i++) {
            if (this.joinList.get(i).contains(index))
                return i;
        }
        throw new IllegalStateException("Input index should always be within one of the sets.");
    }

    void registerJoin(JoinKey joinKey, String joinedString) {
        int leftSetIndex = findIndexInJoined(joinKey.getLeftIndex());
        int rightSetIndex = findIndexInJoined(joinKey.getRightIndex());

        Set<Integer> leftSet = joinList.get(leftSetIndex);

        leftSet.addAll(joinList.get(rightSetIndex));
        joinList.remove(rightSetIndex);

        leftSet.forEach(i -> this.joinedMap.put(i, joinedString));
    }

    String getJoinedString(int index) {
        return this.joinedMap.get(index);
    }
}
