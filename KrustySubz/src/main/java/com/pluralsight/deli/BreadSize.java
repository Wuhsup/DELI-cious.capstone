package com.pluralsight.deli;

public enum BreadSize {
    SMALL(4),
    MEDIUM(8),
    LARGE(12);

    private final int i;

    BreadSize(int i) {
        this.i = i;
    }

}
