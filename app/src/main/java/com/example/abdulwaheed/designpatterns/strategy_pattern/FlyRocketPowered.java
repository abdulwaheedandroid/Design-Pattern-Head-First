package com.example.abdulwaheed.designpatterns.strategy_pattern;

import android.util.Log;

public class FlyRocketPowered implements FlyBehaviour {

    private final String TAG = FlyRocketPowered.class.getSimpleName();

    @Override
    public void fly() {
        Log.i(TAG, "I am flying with rocket");
    }
}
