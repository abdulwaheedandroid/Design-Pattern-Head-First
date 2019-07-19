package com.example.abdulwaheed.designpatterns.compound_pattern;

import android.util.Log;

public class DuckSimulator {
    private final String TAG = DuckSimulator.class.getSimpleName();

    public void simulate() {
        Quackable mallardDuck = new MallardDuck(null);
        Quackable redHeadDuck = new RedHeadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        // this is compound pattern sample in terms of Adapter pattern
        Quackable gooseDuck = new GooseAdapter(new Goose());

        //this is compound pattern sample in terms of Decorator Pattern

        Quackable mallardDuck1 = new QuackCounter(new MallardDuck(null));
        Quackable redHeadDuck1 = new QuackCounter(new RedHeadDuck());
        Quackable duckCall1 = new QuackCounter(new DuckCall());
        Quackable rubberDuck1 = new QuackCounter(new RubberDuck());

        Log.i(TAG, "Duck Simulator");

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        //DECORATOR SIMULATION
        simulate(mallardDuck1);
        simulate(redHeadDuck1);
        simulate(duckCall1);
        simulate(rubberDuck1);

        Log.i(TAG, "Ducks quacked " + QuackCounter.getNumberOfQuacks() + "times");

        //this is compound pattern sample in terms of Abstract Factory Pattern
        AbstactDuckFactory duckFactory = new CountingDuckFactory();
        simulate(duckFactory);

    }

    public void simulate(Quackable duck) {
        duck.quack();
    }

    public void simulate(AbstactDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        //this is compound pattern sample in terms of Iterator Pattern
        Flock flockOfMallards = new Flock();
        flockOfMallards.add(mallardDuck);
        flockOfMallards.add(redHeadDuck);
        flockOfMallards.add(duckCall);
        flockOfMallards.add(rubberDuck);

    }
}
