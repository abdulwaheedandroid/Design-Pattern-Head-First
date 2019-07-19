package com.example.abdulwaheed.designpatterns.adapter_pattern;

import android.util.Log;

public class MallardDuck implements Duck {

    private final String TAG = MallardDuck.class.getSimpleName();

    @Override
    public void quack() {
        Log.i(TAG, "QUACK");
    }

    @Override
    public void fly() {
        Log.i(TAG, "I'm flying");
    }
}
