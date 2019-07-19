package com.example.abdulwaheed.designpatterns.iterator_pattern;

import android.util.Log;

import java.util.ArrayList;

public class PenCakHouseMenu {
    static final int MAX_ITEMS = 6;
    private final String TAG = PenCakHouseMenu.class.getSimpleName();
    int numberOfItems = 0;
    ArrayList menuItems;

    public PenCakHouseMenu() {
        menuItems = new ArrayList();
        addItem(null, null, null, 0.0);
    }

    public void addItem(String name, String description, String vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            Log.i(TAG, "Sorry, menu is full");
        }

        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new PenCakeItertor(menuItems);
    }
}
