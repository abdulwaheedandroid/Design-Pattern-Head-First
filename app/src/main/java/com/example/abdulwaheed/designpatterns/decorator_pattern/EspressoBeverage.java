package com.example.abdulwaheed.designpatterns.decorator_pattern;

public class EspressoBeverage extends Beverage {

    public EspressoBeverage() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
