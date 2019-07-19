package com.example.abdulwaheed.designpatterns.strategy_pattern;

import android.util.Log;

public class Quack implements QuackBehaviour {

    private final String TAG = Quack.class.getSimpleName();

    @Override
    public void quack() {
        Log.e(TAG, "Quack!");
    }
}
