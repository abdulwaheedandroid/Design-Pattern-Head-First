package com.example.abdulwaheed.designpatterns.factory_pattern.abstract_factory_pattern;

public interface PizzaIngredientsFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();
}
