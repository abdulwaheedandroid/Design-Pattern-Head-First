package com.example.abdulwaheed.designpatterns.factory_pattern.abstract_factory_pattern;

import android.util.Log;

public class CheesePizza extends Pizza {

    private final String TAG = CheesePizza.class.getSimpleName();

    protected PizzaIngredientsFactory pizzaIngredientsFactory;

    public CheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
        this.pizzaIngredientsFactory = pizzaIngredientsFactory;
    }

    @Override
    void prepare() {
        Log.i(TAG, "Preparing " + name);
        dough = pizzaIngredientsFactory.createDough();
        sauce = pizzaIngredientsFactory.createSauce();
        cheese = pizzaIngredientsFactory.createCheese();
        clams = pizzaIngredientsFactory.createClams();
    }
}
