package com.example.abdulwaheed.designpatterns.state_pattern;

import android.util.Log;

import java.util.Random;

public class HasQuarterState implements State {
    private final String TAG = HasQuarterState.class.getSimpleName();

    Random randomWinner = new Random(System.currentTimeMillis());

    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        Log.i(TAG, "You cannot insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        Log.i(TAG, "Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        Log.i(TAG, "You turned");
        int winner = randomWinner.nextInt(10);
        if (winner == 0 && gumballMachine.count > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else
            gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        Log.i(TAG, "No Gumball dispense");
    }
}
