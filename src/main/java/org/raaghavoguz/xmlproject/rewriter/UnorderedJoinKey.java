package org.raaghavoguz.xmlproject.rewriter;

import java.util.Objects;

public class UnorderedJoinKey {
    private final int leftIndex;
    private final int rightIndex;

    public UnorderedJoinKey(int leftIndex, int rightIndex) {
        this.leftIndex = leftIndex;
        this.rightIndex = rightIndex;
    }

    public int getLeftIndex() {
        return leftIndex;
    }

    public int getRightIndex() {
        return rightIndex;
    }

    public JoinKey ordered() {
        return new JoinKey(this.leftIndex, this.rightIndex);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof UnorderedJoinKey &&
                ((this.leftIndex == ((UnorderedJoinKey) obj).leftIndex &&
                        this.rightIndex == ((UnorderedJoinKey) obj).rightIndex) ||
                (this.leftIndex == ((UnorderedJoinKey) obj).rightIndex &&
                        this.rightIndex == ((UnorderedJoinKey) obj).leftIndex));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.leftIndex, this.rightIndex) + Objects.hash(this.rightIndex, this.leftIndex);
    }
}
