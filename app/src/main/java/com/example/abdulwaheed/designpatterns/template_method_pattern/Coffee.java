package com.example.abdulwaheed.designpatterns.template_method_pattern;

import android.util.Log;

public class Coffee {

    private final String TAG = Coffee.class.getSimpleName();

    void prepare() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugerAndMilk();
    }

    public void boilWater() {
        Log.i(TAG, "boiling water");
    }

    public void brewCoffeeGrinds() {
        Log.i(TAG, "dripping coffee through filter");
    }

    public void pourInCup() {
        Log.i(TAG, "pouring into cup");
    }

    public void addSugerAndMilk() {
        Log.i(TAG, "adding sugar and milk");
    }
}
