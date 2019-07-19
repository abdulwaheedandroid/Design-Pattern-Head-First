package com.example.abdulwaheed.designpatterns.compound_pattern;

import android.util.Log;

public class Quackologist implements Observer {
    private final String TAG = Quackologist.class.getSimpleName();

    @Override
    public void update(QuackObservable quackObservable) {
        Log.i(TAG, "Quackologist : " + quackObservable + "just quacked");
    }
}
