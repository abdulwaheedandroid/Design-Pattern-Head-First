package com.example.abdulwaheed.designpatterns.state_pattern;

import android.util.Log;

public class NoQuarterState implements State {

    private final String TAG = NoQuarterState.class.getSimpleName();

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        Log.i(TAG, "You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        Log.i(TAG, "You have not inserted a quarter");
    }

    @Override
    public void turnCrank() {
        Log.i(TAG, "You turned, but there is no quarter");
    }

    @Override
    public void dispense() {
        Log.i(TAG, "You need to pay first");
    }
}
