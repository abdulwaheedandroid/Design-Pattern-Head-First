package com.example.abdulwaheed.designpatterns.state_pattern;

import android.util.Log;

public class GumballMachine {

    private final String TAG = GumballMachine.class.getSimpleName();
    int count;
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    /*    public static int SOLD_OUT = 0;
        public static int NO_QUARTER = 1;
        public static int HAS_QUARTER = 2;
        public static int SOLD = 3;

        int state = SOLD_OUT;*/
    private State state = soldOutState;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState();
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
        /*if (state == HAS_QUARTER) {
            Log.e(TAG, "You can't insert another quarter");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            Log.e(TAG, "You inserted a quarter");
        } else if (state == SOLD_OUT) {
            Log.e(TAG, "You can't insert a quarter, the machine is sold out");
        } else if (state == SOLD) {
            Log.e(TAG, "We are already giving you a gumbell");
        }*/
    }

    public void ejectQuarter() {
        state.ejectQuarter();
        /*if (state == HAS_QUARTER) {
            Log.e(TAG, "Quarter returned");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            Log.e(TAG, "You have not inserted a quarter");
        } else if (state == SOLD_OUT) {
            Log.e(TAG, "You can't eject, you have not inserted a quarter");
        } else if (state == SOLD) {
            Log.e(TAG, "Sorry, you already turned the crank");
        }*/
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
       /* if (state == SOLD) {
            Log.e(TAG, "Turning twice does not get you another gumball");
        } else if (state == NO_QUARTER) {
            Log.e(TAG, "You turned but there is not quarter");
        } else if (state == SOLD_OUT) {
            Log.e(TAG, "You turned but there are no gumball");
        } else if (state == SOLD) {
            Log.e(TAG, "You turned");
            state = SOLD;
            dispense();
        }*/
    }


    /*public void dispense() {
        if (state == SOLD) {
            Log.e(TAG, "A gumball comes rolling out the slot.");
            count = count -1;
            if (count == 0) {
                Log.e(TAG, "OOppss, out of gumball");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            Log.e(TAG, "You need to play first");
        } else if (state == SOLD_OUT) {
            Log.e(TAG, "No gumball dispensed");
        } else if (state == HAS_QUARTER) {
            Log.e(TAG, "No gumball dispensed");
        }
    }*/
    void releaseBall() {
        Log.i(TAG, "A gumbell comes rolling out the slot....");
        if (count != 0)
            count = -1;
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }
}
