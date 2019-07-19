package com.example.abdulwaheed.designpatterns.compound_pattern;

import android.util.Log;


public class MallardDuck implements Quackable {
    private final String TAG = MallardDuck.class.getSimpleName();

    Observable observable;

    public MallardDuck(Observable observable) {
        this.observable = observable;
    }


    @Override
    public void quack() {
        Log.i(TAG, "Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
