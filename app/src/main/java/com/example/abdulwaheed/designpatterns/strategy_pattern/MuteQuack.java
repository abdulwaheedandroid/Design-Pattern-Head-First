package com.example.abdulwaheed.designpatterns.strategy_pattern;

import android.util.Log;

public class MuteQuack implements QuackBehaviour {

    private final String TAG = MuteQuack.class.getSimpleName();

    @Override
    public void quack() {
        Log.e(TAG, "<<Silence>>!");
    }
}
