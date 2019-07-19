package com.example.abdulwaheed.designpatterns.compound_pattern;

public class QuackCounter implements Quackable {

    public static int numberOfQuacks;
    private final String TAG = QuackCounter.class.getSimpleName();
    private Quackable duck;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }
}
