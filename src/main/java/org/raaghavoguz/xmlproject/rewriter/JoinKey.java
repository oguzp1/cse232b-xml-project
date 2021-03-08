package org.raaghavoguz.xmlproject.rewriter;

import java.util.Objects;

class JoinKey {
    private final int leftIndex;
    private final int rightIndex;

    JoinKey(int leftIndex, int rightIndex) {
        this.leftIndex = leftIndex;
        this.rightIndex = rightIndex;
    }

    int getLeftIndex() {
        return leftIndex;
    }

    int getRightIndex() {
        return rightIndex;
    }

    JoinKey invert() {
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
