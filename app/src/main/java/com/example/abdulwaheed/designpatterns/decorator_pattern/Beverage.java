package com.example.abdulwaheed.designpatterns.decorator_pattern;

public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();


}
