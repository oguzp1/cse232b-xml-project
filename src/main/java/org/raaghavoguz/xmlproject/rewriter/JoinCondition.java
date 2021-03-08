package org.raaghavoguz.xmlproject.rewriter;

import java.util.Objects;

class JoinCondition {
    private final String leftVariable;
    private final String rightVariable;

    JoinCondition(String key) {
        String[] variables = key.split("\\$");

        this.leftVariable = variables[1].split("\\s+")[0];
        this.rightVariable = variables[2].split("\\s+")[0];
    }

    String getLeftVariable() {
        return leftVariable;
    }

    String getRightVariable() {
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
