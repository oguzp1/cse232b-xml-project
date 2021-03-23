package org.raaghavoguz.xmlproject.rewriter;

import java.util.Objects;

public class JoinKey {
    private final int leftIndex;
    private final int rightIndex;

    public JoinKey(int leftIndex, int rightIndex) {
        this.leftIndex = leftIndex;
        this.rightIndex = rightIndex;
    }

    public int getLeftIndex() {
        return leftIndex;
    }

    public int getRightIndex() {
        return rightIndex;
    }

    public JoinKey invert() {
        return new JoinKey(this.rightIndex, this.leftIndex);
    }

    public UnorderedJoinKey unordered() {
        return new UnorderedJoinKey(this.leftIndex, this.rightIndex);
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
