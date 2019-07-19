package com.example.abdulwaheed.designpatterns.compound_pattern;

public interface QuackObservable {

    void registerObserver(Observer observer);

    void notifyObservers();
}
