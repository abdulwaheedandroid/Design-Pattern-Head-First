package com.example.abdulwaheed.designpatterns.template_method_pattern;

import android.util.Log;

public class MyCoffeeWithHook extends CaffeineBeverageWithHook {

    private final String TAG = MyCoffeeWithHook.class.getSimpleName();

    @Override
    void brew() {
        Log.i(TAG, "dipping coffee through filter");
    }

    @Override
    void addCondiments() {
        Log.i(TAG, "adding sugar and milk");
    }

    @Override
    public boolean customerWantCondiments() {
        return false;
    }
}
