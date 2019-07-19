package com.example.abdulwaheed.designpatterns.observer_pattern;

import android.util.Log;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private final String TAG = CurrentConditionDisplay.class.getSimpleName();

    private Subject subject;
    private float temperature, pressure, humidity;

    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void display() {
        Log.i(TAG, "Current Conditions : " + temperature + " F degree " + humidity + " % " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.pressure = pressure;
        this.humidity = humidity;

        display();
    }
}
