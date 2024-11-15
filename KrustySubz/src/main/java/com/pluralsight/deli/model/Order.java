package com.pluralsight.deli.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String customerName;
    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Drinks> drinks = new ArrayList<>();
}
