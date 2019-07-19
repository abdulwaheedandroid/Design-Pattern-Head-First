package com.example.abdulwaheed.designpatterns.command_pattern;

import android.util.Log;

public class Stereo {
    private final String TAG = Stereo.class.getSimpleName();

    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        Log.i(TAG, "On method is called");
    }

    public void off() {
        Log.i(TAG, "Off method is called");
    }

    public void setCD() {
    }

    public void setDvD() {
    }

    public void setVolume(int volume) {
    }
}
