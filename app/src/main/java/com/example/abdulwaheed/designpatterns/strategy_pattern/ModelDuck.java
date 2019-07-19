package com.example.abdulwaheed.designpatterns.strategy_pattern;

import android.util.Log;

public class ModelDuck extends Duck {

    private final String TAG = ModelDuck.class.getSimpleName();

    public ModelDuck() {
        mQuackBehaviour = new Quack();
        mFlyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        Log.i(TAG, "I am model duck!");
    }

}
