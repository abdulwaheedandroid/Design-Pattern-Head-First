package com.example.abdulwaheed.designpatterns.state_pattern;

import android.util.Log;

public class SoldOutState implements State {

    private final String TAG = SoldOutState.class.getSimpleName();
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        Log.i(TAG, "You cannot insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        Log.i(TAG, "You cannot eject, you have not inserted a quarter");
    }

    @Override
    public void turnCrank() {
        Log.i(TAG, "You turned but there are no quarters");
    }

    @Override
    public void dispense() {
        Log.i(TAG, "No gumball dispensed");
    }
}
