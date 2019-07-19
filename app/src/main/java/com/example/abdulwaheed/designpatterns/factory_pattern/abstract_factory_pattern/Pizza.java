package com.example.abdulwaheed.designpatterns.factory_pattern.abstract_factory_pattern;

import android.util.Log;

public abstract class Pizza {

    private final String TAG = Pizza.class.getSimpleName();
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    abstract void prepare();

    protected void bake() {
        Log.i(TAG, "Bake for 25 minutes at 350");
    }

    protected void cut() {
        Log.i(TAG, "Cutting the pizza into diagnol slices");
    }

    protected void box() {
        Log.i(TAG, "Place pizza in office Pizza Store box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
