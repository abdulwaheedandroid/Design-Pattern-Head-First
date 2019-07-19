package com.example.abdulwaheed.designpatterns.observer_pattern;

import java.util.Observable;

public class WeatherData2 extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData2() {
    }

    public void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        measurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
