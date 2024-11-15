package com.pluralsight.deli.model.enums;

public enum Topping {

    //Meat choices

    STEAK("Meat"),
    HAM("Meat"),
    SALAMI("Meat"),
    ROAST_BEEF("Meat"),
    CHICKEN("Meat"),
    BACON("Meat"),

    //Cheese options

    AMERICAN("Cheese"),
    PROVOLONE("Cheese"),
    CHEDDAR("Cheese"),
    SWISS("Cheese"),

    //Regular toppings

    Lettuce("Veggie"),
    Peppers("Veggie"),
    Onions("Veggie"),
    Tomatoes("Veggie"),
    Cucumbers("Veggie"),
    Pickles("Veggie"),
    Guacamole("Veggie"),
    Mushrooms("Veggie");




    private final String toppingType;

    Topping(String toppingType){
        this.toppingType = toppingType;

    }

    public String getToppingType() {
        return toppingType;
    }
}
