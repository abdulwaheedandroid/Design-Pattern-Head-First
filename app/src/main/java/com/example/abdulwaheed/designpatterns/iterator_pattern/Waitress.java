package com.example.abdulwaheed.designpatterns.iterator_pattern;

import android.util.Log;

public class Waitress {

    private final String TAG = Waitress.class.getSimpleName();

    PenCakHouseMenu penCakHouseMenu;
    DinerMenu dinerMenu;


    public Waitress(PenCakHouseMenu penCakHouseMenu, DinerMenu dinerMenu) {
        this.penCakHouseMenu = penCakHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pencakeIterator = penCakHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        Log.i(TAG, "MENU BREAKFAST");


    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            Log.i(TAG, menuItem.getName());
            Log.i(TAG, menuItem.getDescription());
            Log.i(TAG, menuItem.getPrice());
        }
    }
}
