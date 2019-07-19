package com.example.abdulwaheed.designpatterns.factory_pattern.factory_store_framework;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin crust dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Regiano Cheese");
    }
}
