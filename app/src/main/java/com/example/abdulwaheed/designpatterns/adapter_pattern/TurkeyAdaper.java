package com.example.abdulwaheed.designpatterns.adapter_pattern;

public class TurkeyAdaper implements Duck {

    Turkey turkey;

    public TurkeyAdaper(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int a = 0; a < 5; a++) {
            turkey.fly();
        }
    }
}
