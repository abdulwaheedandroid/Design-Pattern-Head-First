package com.example.abdulwaheed.designpatterns.iterator_pattern;

public class MenuItem {
    double price;
    private String name;
    private String description;
    private String vegetarian;

    public MenuItem(String name, String description, String vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(String vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
