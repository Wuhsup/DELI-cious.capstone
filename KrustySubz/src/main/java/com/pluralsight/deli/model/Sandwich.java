package com.pluralsight.deli.model;

import com.pluralsight.deli.model.enums.BreadSize;
import com.pluralsight.deli.model.enums.BreadType;
import com.pluralsight.deli.model.enums.SauceType;
import com.pluralsight.deli.model.enums.Topping;

import java.util.List;


public class Sandwich extends Item {
    private BreadSize size;
    private BreadType breadType;
    private List<Topping> toppings;
    private List<SauceType> sauces;
    private boolean extraMeat;
    private boolean toasted;

    // constructor made for the Sandwich class
    public Sandwich(String name, BreadSize size, BreadType breadType, List<Topping> toppings,
                    List<SauceType> sauces, boolean extraMeat, boolean toasted) {
        super(name, getBasePrice(size)); // call the constructor of the Item class
        this.size = size;
        this.breadType = breadType;
        this.toppings = toppings;
        this.sauces = sauces;
        this.extraMeat = extraMeat;
        this.toasted = toasted;
    }

    // created a switch method that will calculate the base price based on sandwich size.
    private static double getBasePrice(BreadSize size) {
        switch (size) {
            case SMALL:
                return 5.50;
            case MEDIUM:
                return 7.00;
            case LARGE:
                return 8.50;
            default:
                return 0.0; // will only return 0.0 if the user inputs an invalid size.
        }
    }

    // method to calculate additional cost based on extra toppings
    @Override
    public double getExtraPrice() {
        double totalPrice = getPrice();

        // Add extra charges for cheese and extra meat
        for (Topping topping : toppings) {
            if (topping.getToppingType().equals("Cheese")) {
                totalPrice += getCheesePrice(size);
            }
            if (topping.getToppingType().equals("Meat") && extraMeat) {
                totalPrice += getExtraMeatPrice(size);
            }
        }

        return totalPrice;
    }

    // method to calculate extra price for cheese based on sandwich size
    private double getCheesePrice(BreadSize size) {
        switch (size) {
            case SMALL:
                return 0.30;
            case MEDIUM:
                return 0.60;
            case LARGE:
                return 0.90;
            default:
                return 0.0; //only will return 0.0 if you select the wrong bread size.
        }
    }

    // switch method created to calculate price for extra meat based on the sandwich size.
    private double getExtraMeatPrice(BreadSize size) {
        switch (size) {
            case SMALL:
                return 0.50;
            case MEDIUM:
                return 1.00;
            case LARGE:
                return 1.50;
            default:
                return 0.0; //only will return 0.0 if you select the wrong bread size.
        }
    }

    public BreadSize getSize() {
        return size;
    }

    public void setSize(BreadSize size) {
        this.size = size;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public List<SauceType> getSauces() {
        return sauces;
    }

    public void setSauces(List<SauceType> sauces) {
        this.sauces = sauces;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    @Override
    public double totalPrice() {
        return 0;
    }
}
