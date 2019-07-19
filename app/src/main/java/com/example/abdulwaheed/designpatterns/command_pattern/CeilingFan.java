package com.example.abdulwaheed.designpatterns.command_pattern;

import android.util.Log;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private final String TAG = CeilingFan.class.getSimpleName();
    int speed;
    private String name;

    public CeilingFan(String name) {
        this.name = name;
        speed = OFF;
    }

    public void on() {
        Log.i(TAG, "On method is called");
    }

    public void off() {
        Log.i(TAG, "Off method is called");
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
    }

    public void medium() {
        speed = MEDIUM;
    }

    public void low() {
        speed = LOW;
    }

    public int getSpeed() {
        return speed;
    }
}
