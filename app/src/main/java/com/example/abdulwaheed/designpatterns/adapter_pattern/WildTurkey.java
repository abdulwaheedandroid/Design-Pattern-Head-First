package com.example.abdulwaheed.designpatterns.adapter_pattern;

import android.util.Log;

public class WildTurkey implements Turkey {

    private final String TAG = WildTurkey.class.getSimpleName();

    @Override
    public void fly() {
        Log.i(TAG, "I'm flying a short distance");
    }

    @Override
    public void gobble() {
        Log.i(TAG, "Gobble gobble");
    }
}
