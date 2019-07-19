package com.example.abdulwaheed.designpatterns.template_method_pattern;

import android.util.Log;

public class MyTea extends CaffeineBeverage {

    private final String TAG = MyTea.class.getSimpleName();

    @Override
    void brew() {
        Log.i(TAG, "stepping the tea");
    }

    @Override
    void addCondiments() {
        Log.i(TAG, "adding lemon");
    }
}
