package com.example.abdulwaheed.designpatterns.factory_pattern.factory_store_framework;

import android.util.Log;

public class ChicagoStyleCheesePizza extends Pizza {

    private final String TAG = ChicagoStyleCheesePizza.class.getSimpleName();

    public ChicagoStyleCheesePizza() {
        name = "Chicago Deep Dish Cheese Pizza";
        dough = "Extra Thick crust dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");

    }

    @Override
    public void cut() {
        Log.i(TAG, "Cutting the Pizza into square Slices");
    }
}
