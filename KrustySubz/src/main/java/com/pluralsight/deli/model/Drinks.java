package com.pluralsight.deli.model;

import com.pluralsight.deli.model.enums.DrinkSize;

public class Drinks extends Item {


    private DrinkSize drinkSize;

    // created a constructor to initialize the drink with its size.
    public Drinks(DrinkSize drinkSize) {
        super("Drink", calculatePrice(drinkSize));  // call on the Item constructor setting the name and price based on the size.
        this.drinkSize = drinkSize;
    }

    // static method created to calculate the price based on the drink sizes.
    private static double calculatePrice(DrinkSize drinkSize) {
        switch (drinkSize) {
            case SMALL: return 2.00;
            case MEDIUM: return 2.50;
            case LARGE: return 3.00;
            default: return 0.00; // will only return 0.0 if the user inputs an invalid size.
        }
    }


    public DrinkSize getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(DrinkSize drinkSize) {
        this.drinkSize = drinkSize;
    }


    @Override
    public double getPrice() {
        return super.getPrice();  // this will return the price calculated in the Item class constructor.
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
        return "Drinks{" + "drinkSize=" + drinkSize + ", price=" + getPrice() + '}';

    }
}
