package com.pluralsight.deli.model;

import com.pluralsight.deli.model.enums.CheeseType;
import com.pluralsight.deli.model.enums.MeatType;
import com.pluralsight.deli.model.enums.RegularTopping;
import com.pluralsight.deli.model.enums.SauceType;

public class Toppings {

    public Toppings(Object o, MeatType meatType, Object o1, Object o2) {

    }

    public class Topping {
        private CheeseType cheeseType;
        private MeatType meatType;
        private RegularTopping regularTopping;
        private SauceType sauceType;

        // Constructor for Toppings to allow flexibility
        public Topping(CheeseType cheeseType, MeatType meatType, RegularTopping regularTopping, SauceType sauceType) {
            this.cheeseType = cheeseType;
            this.meatType = meatType;
            this.regularTopping = regularTopping;
            this.sauceType = sauceType;
        }

        // Getters and Setters
        public CheeseType getCheeseType() {
            return cheeseType;
        }

        public void setCheeseType(CheeseType cheeseType) {
            this.cheeseType = cheeseType;
        }

        public MeatType getMeatType() {
            return meatType;
        }

        public void setMeatType(MeatType meatType) {
            this.meatType = meatType;
        }

        public RegularTopping getRegularTopping() {
            return regularTopping;
        }

        public void setRegularTopping(RegularTopping regularTopping) {
            this.regularTopping = regularTopping;
        }

        public SauceType getSauceType() {
            return sauceType;
        }

        public void setSauceType(SauceType sauceType) {
            this.sauceType = sauceType;
        }

        // Override toString for a better display of selected toppings
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (cheeseType != null) sb.append("Cheese: ").append(cheeseType).append("\n");
            if (meatType != null) sb.append("Meat: ").append(meatType).append("\n");
            if (regularTopping != null) sb.append("Veggie: ").append(regularTopping).append("\n");
            if (sauceType != null) sb.append("Sauce: ").append(sauceType).append("\n");
            return sb.toString().trim();
        }
    }

}
