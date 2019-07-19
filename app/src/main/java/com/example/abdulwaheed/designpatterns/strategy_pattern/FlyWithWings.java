package com.example.abdulwaheed.designpatterns.strategy_pattern;

import android.util.Log;

public class FlyWithWings implements FlyBehaviour {

    private final String TAG = FlyWithWings.class.getSimpleName();


    @Override
    public void fly() {
        Log.i(TAG, "I am flying!");
    }
}
