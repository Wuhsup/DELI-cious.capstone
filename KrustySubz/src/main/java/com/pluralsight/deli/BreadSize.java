package com.pluralsight.deli;

public enum BreadSize {
    Small(4), Medium(8), Large(12);

    private final int inches;

    BreadSize(int inches) {
        this.inches = inches;
    }

    public int getInches() {
        return inches;
    }

    public double getPriceAdjustment() {
        switch (this) {

            case Small:
                return 6.20;
            case Medium:
                return 8.45;
            case Large:
                return 10.85;
            default:
                return 0.0;
        }
    }

}
