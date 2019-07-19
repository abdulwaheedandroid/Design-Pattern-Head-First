package com.example.abdulwaheed.designpatterns.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> listOfObservers;

    private float temperature, humidity, pressure;

    public WeatherData() {
        listOfObservers = new ArrayList<>();
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        measurementChanged();
    }

    @Override
    public void registerObserver(Observer observer) {
        listOfObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = listOfObservers.indexOf(observer);
        if (index >= 0) {
            listOfObservers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer currentObserver : listOfObservers) {
            currentObserver.update(temperature, humidity, pressure);
        }
    }
}
