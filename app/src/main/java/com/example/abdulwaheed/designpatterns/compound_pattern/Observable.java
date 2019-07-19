package com.example.abdulwaheed.designpatterns.compound_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements QuackObservable {

    private List observerList = new ArrayList();
    private QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }


    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observerList.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
