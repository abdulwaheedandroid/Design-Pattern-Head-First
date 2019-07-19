package com.example.abdulwaheed.designpatterns.compound_pattern;

import android.util.Log;

public class Goose {
    private final String TAG = DuckSimulator.class.getSimpleName();

    public void honk() {
        Log.i(TAG, "Honk");
    }
}
