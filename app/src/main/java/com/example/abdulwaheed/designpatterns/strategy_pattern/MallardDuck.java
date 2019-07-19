package com.example.abdulwaheed.designpatterns.strategy_pattern;

import android.util.Log;

public class MallardDuck extends Duck {

    private final String TAG = MallardDuck.class.getSimpleName();

    public MallardDuck() {
        mFlyBehaviour = new FlyWithWings();
        mQuackBehaviour = new Quack();
    }

    @Override
    public void display() {
        Log.i(TAG, "I am real Mallard Duck!");
    }
}
