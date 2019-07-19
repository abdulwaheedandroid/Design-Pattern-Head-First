package com.example.abdulwaheed.designpatterns.iterator_pattern;

import android.util.Log;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    private final String TAG = DinerMenu.class.getSimpleName();
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem(null, null, null, 0.0);
    }

    public void addItem(String name, String description, String vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            Log.i(TAG, "Sorry, menu is full");
        }
        menuItems[numberOfItems] = menuItem;
        numberOfItems += 1;
    }

    public Iterator createIterator() {
        return new DinerMenuItertor(menuItems);
    }
}
