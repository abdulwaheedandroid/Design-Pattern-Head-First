package com.example.abdulwaheed.designpatterns.compound_pattern;

import android.util.Log;

public class DuckCall implements Quackable {
    private final String TAG = DuckCall.class.getSimpleName();

    @Override
    public void quack() {
        Log.i(TAG, "Kwak");
    }
}
