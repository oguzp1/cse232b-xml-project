package org.raaghavoguz.xmlproject.rewriter;

import java.util.ArrayList;
import java.util.HashSet;

class ClosureList extends ArrayList<HashSet<String>> {
    HashSet<String> getMatchingSet(String variable) {
        for (HashSet<String> closure : this) {
            if (closure.contains(variable)) {
                return closure;
            }
        }
        throw new IllegalArgumentException("Input variable must be in one of the closures");
    }

    int getMatchingSetIndex(String variable) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).contains(variable)) {
                return i;
            }
        }
        throw new IllegalArgumentException("Input variable must be in one of the closures");
    }
}
