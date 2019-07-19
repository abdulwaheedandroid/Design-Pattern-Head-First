package com.example.abdulwaheed.designpatterns.observer_pattern;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay2 implements Observer, DisplayElement {

    private final String TAG = CurrentConditionDisplay2.class.getSimpleName();

    private Observable observable;
    private float temperature, pressure, humidity;

    public CurrentConditionDisplay2(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void display() {
        Log.i(TAG, "Current Conditions : " + temperature + " F degree " + humidity + " % " + pressure);
    }


    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData2) {
            WeatherData2 weatherData2 = (WeatherData2) observable;
            this.temperature = weatherData2.getTemperature();
            this.humidity = weatherData2.getHumidity();
            display();
        }
    }
}
