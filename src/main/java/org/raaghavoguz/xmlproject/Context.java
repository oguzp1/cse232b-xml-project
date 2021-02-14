package org.raaghavoguz.xmlproject;

import org.w3c.dom.Node;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Context {
    final private Map<String, List<Node>> mapping;

    public Context() {
        this.mapping = new HashMap<>();
    }

    public Context(Context other) {
        this.mapping = new HashMap<>(other.mapping);
    }

    public List<Node> lookup(String varName) {
        return this.mapping.get(varName);
    }

    public Context extend(String varName, List<Node> nodeList) {
        Context newContext = new Context(this);
        newContext.mapping.put(varName, nodeList);
        return newContext;
    }

    public List<Context> possibleContexts(String varName, List<Node> nodeList) {
        return nodeList.stream()
                .map(n -> this.extend(varName, Collections.singletonList(n)))
                .collect(Collectors.toList());
    }
}
