package com.example.abdulwaheed.designpatterns.template_method_pattern;

import android.util.Log;

public class Tea {

    private final String TAG = Tea.class.getSimpleName();

    void prepare() {
        boilWater();
        stepTeaBeg();
        pourInCup();
        addLemon();
    }

    public void boilWater() {
        Log.i(TAG, "boiling water");
    }

    public void stepTeaBeg() {
        Log.i(TAG, "stepping the tea");
    }

    public void pourInCup() {
        Log.i(TAG, "pouring into cup");
    }

    public void addLemon() {
        Log.i(TAG, "adding lemon");
    }
}
