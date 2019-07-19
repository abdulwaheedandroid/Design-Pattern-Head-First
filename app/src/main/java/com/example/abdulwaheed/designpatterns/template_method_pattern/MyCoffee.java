package com.example.abdulwaheed.designpatterns.template_method_pattern;

import android.util.Log;

public class MyCoffee extends CaffeineBeverage {

    private final String TAG = MyCoffee.class.getSimpleName();

    @Override
    void brew() {
        Log.i(TAG, "dipping coffee through filter");
    }

    @Override
    void addCondiments() {
        Log.i(TAG, "adding sugar and milk");
    }
}
