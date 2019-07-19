package com.example.abdulwaheed.designpatterns.strategy_pattern;

import android.util.Log;

public class FlyNoWay implements FlyBehaviour {

    private final String TAG = FlyNoWay.class.getSimpleName();

    @Override
    public void fly() {
        Log.i(TAG, "I cannot fly!");
    }
}
