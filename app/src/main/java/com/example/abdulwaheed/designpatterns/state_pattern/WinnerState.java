package com.example.abdulwaheed.designpatterns.state_pattern;

import android.util.Log;

public class WinnerState implements State {

    private final String TAG = WinnerState.class.getSimpleName();

    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        Log.i(TAG, "Insert quarter error message");
    }

    @Override
    public void ejectQuarter() {
        Log.i(TAG, "Eject quarter error message");
    }

    @Override
    public void turnCrank() {
        Log.i(TAG, "Turn Crank error message");
    }

    @Override
    public void dispense() {
        Log.i(TAG, "YOU ARE A WINNER! you get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.count == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.count > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                Log.i(TAG, "oopss out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
