package com.example.abdulwaheed.designpatterns.factory_pattern.factory_store_framework;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    com.example.abdulwaheed.designpatterns.factory_pattern.factory_store_framework.Pizza createPizza(String type) {
        com.example.abdulwaheed.designpatterns.factory_pattern.factory_store_framework.Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleClamVeggiePizza();
        }
        return pizza;

    }
}
