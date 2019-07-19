package com.example.abdulwaheed.designpatterns.compound_pattern;

import android.util.Log;

public class RubberDuck implements Quackable {
    private final String TAG = RubberDuck.class.getSimpleName();

    @Override
    public void quack() {
        Log.i(TAG, "Squeak");
    }
}
