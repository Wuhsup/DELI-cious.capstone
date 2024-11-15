package com.pluralsight.deli.model;

public abstract class Item {
    public String name;
    public double price;

    //created a constructor for subclasses
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // created a getter & setter for the name.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // created getter and setter for the price.
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to calculate additional cost based on toppings and extras.
    public abstract double getExtraPrice();

    // the abstract method was made to calculate the price. this will be implemented in subclasses
    public abstract double totalPrice();
}
