package com.pluralsight.deli;

import com.pluralsight.deli.model.Item;

public class Chips extends Item {

    private String chipFlavor;  // The flavor of the chips
    private static final double price = 1.50;  // The fixed price for chips

    // created a constructor to initialize the chip flavor
    public Chips(String chipFlavor) {
        super("Chips", price);  // calling on the super class (Item) with the name and price
        this.chipFlavor = chipFlavor;
    }

    public String getChipFlavor() {
        return chipFlavor;
    }

    public void setChipFlavor(String chipFlavor) {
        this.chipFlavor = chipFlavor;
    }

    @Override
    public double getExtraPrice() {
        return 0;
    }

    @Override
    public double totalPrice() {
        return 0;
    }

    @Override
    public String toString() {
        return "Chips{" + "chipFlavor='" + chipFlavor + '\'' + ", price=" + price + '}';
    }
}


