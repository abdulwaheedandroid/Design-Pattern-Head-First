package com.example.abdulwaheed.designpatterns.strategy_pattern;

import android.util.Log;

public abstract class Duck {

    private final String TAG = Duck.class.getSimpleName();

    protected FlyBehaviour mFlyBehaviour;
    protected QuackBehaviour mQuackBehaviour;

    public abstract void display();

    public void performQuack() {
        mQuackBehaviour.quack();
    }

    public void performFly() {
        mFlyBehaviour.fly();
    }

    public void swim() {
        Log.i(TAG, "All ducks float, even decoys!");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        mFlyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        mQuackBehaviour = quackBehaviour;
    }
}
