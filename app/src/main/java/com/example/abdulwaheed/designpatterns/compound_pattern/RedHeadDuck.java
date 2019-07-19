package com.example.abdulwaheed.designpatterns.compound_pattern;

import android.util.Log;

public class RedHeadDuck implements Quackable {
    private final String TAG = RedHeadDuck.class.getSimpleName();

    @Override
    public void quack() {
        Log.i(TAG, "Quack");
    }
}
