package com.pluralsight.deli;

public class KrustySubz {

    public static void main(String[] args) {
        //Create a order

        Order o = new Order();

        // Create a sandwich

        Sandwich s = new Sandwich();
        o.addSandwich(s);

        // Add toppings

        Topping t = new Topping();

        SauceType s = new SauceType();

        // Figure out the price of order
        double price = o.getPrice();
        System.out.println("The price will be " + price);
    }
}
