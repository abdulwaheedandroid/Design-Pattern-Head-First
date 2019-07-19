package com.example.abdulwaheed.designpatterns.factory_pattern.factory_store_framework;

public abstract class PizzaStore {

    public com.example.abdulwaheed.designpatterns.factory_pattern.factory_store_framework.Pizza orderPizza(String type) {
        com.example.abdulwaheed.designpatterns.factory_pattern.factory_store_framework.Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract com.example.abdulwaheed.designpatterns.factory_pattern.factory_store_framework.Pizza createPizza(String type);
}
