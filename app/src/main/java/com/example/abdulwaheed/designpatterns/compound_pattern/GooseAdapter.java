package com.example.abdulwaheed.designpatterns.compound_pattern;

public class GooseAdapter implements Quackable {
    private final String TAG = GooseAdapter.class.getSimpleName();

    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
