package com.example.abdulwaheed.designpatterns.template_method_pattern;

import android.util.Log;

public abstract class CaffeineBeverage {


    private static final String TAG = CaffeineBeverage.class.getSimpleName();

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    public void boilWater() {
        Log.i(TAG, "boiling water");
    }

    public void pourInCup() {
        Log.i(TAG, "pouring into cup");
    }
}
