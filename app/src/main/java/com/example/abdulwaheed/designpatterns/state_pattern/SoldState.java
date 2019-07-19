package com.example.abdulwaheed.designpatterns.state_pattern;

import android.util.Log;

public class SoldState implements State {

    private final String TAG = SoldState.class.getSimpleName();

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        Log.i(TAG, "Please wait! we are already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        Log.i(TAG, "Sorry! you already turned the crank");
    }

    @Override
    public void turnCrank() {
        Log.i(TAG, "Turning twice does not give you another gumball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.count > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            Log.i(TAG, "Oopss!! out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
