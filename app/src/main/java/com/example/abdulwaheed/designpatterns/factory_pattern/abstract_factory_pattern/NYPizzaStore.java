package com.example.abdulwaheed.designpatterns.factory_pattern.abstract_factory_pattern;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        com.example.abdulwaheed.designpatterns.factory_pattern.abstract_factory_pattern.Pizza pizza = null;
        PizzaIngredientsFactory pizzaIngredientsFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientsFactory);
            pizza.setName("New York Style Cheese Pizza");
        }

        return pizza;
    }
}
