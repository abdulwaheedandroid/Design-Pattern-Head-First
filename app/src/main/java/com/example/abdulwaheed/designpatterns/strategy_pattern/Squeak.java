package com.example.abdulwaheed.designpatterns.strategy_pattern;

import android.util.Log;

public class Squeak implements QuackBehaviour {

    private final String TAG = Squeak.class.getSimpleName();

    @Override
    public void quack() {
        Log.e(TAG, "Squeak!");
    }
}
