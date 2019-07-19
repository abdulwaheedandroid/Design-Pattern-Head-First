package com.example.abdulwaheed.designpatterns.state_pattern;

public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
