package com.example.abdulwaheed.designpatterns.observer_pattern;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
