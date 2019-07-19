package com.example.abdulwaheed.designpatterns.command_pattern;

import android.util.Log;

public class Light {
    private final String TAG = Light.class.getSimpleName();

    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        Log.i(TAG, "On method is called");
    }

    public void off() {
        Log.i(TAG, "Off method is called");
    }
}
