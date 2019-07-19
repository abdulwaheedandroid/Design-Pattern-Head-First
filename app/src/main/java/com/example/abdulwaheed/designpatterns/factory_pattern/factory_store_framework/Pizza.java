package com.example.abdulwaheed.designpatterns.factory_pattern.factory_store_framework;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza extends com.example.abdulwaheed.designpatterns.factory_pattern.abstract_factory_pattern.Pizza {
    private final String TAG = Pizza.class.getSimpleName();

    protected String name, dough, sauce;
    List<String> toppings = new ArrayList<>();

    public void prepare() {
        Log.i(TAG, "Preparing " + name);
        Log.i(TAG, "Tossing dough ... ");
        Log.i(TAG, "Adding sauce ... ");
        Log.i(TAG, "Adding toppings ... ");
        for (String currentTopping : toppings) {
            Log.i(TAG, " " + currentTopping);
        }
    }

    public void bake() {
        Log.i(TAG, "Bake for 25 minutes at 350");
    }

    public void cut() {
        Log.i(TAG, "Cutting the pieces into diagonal slices");
    }

    public void box() {
        Log.i(TAG, "Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
