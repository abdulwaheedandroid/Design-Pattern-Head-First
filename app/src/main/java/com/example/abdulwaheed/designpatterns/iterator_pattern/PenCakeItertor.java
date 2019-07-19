package com.example.abdulwaheed.designpatterns.iterator_pattern;

import java.util.ArrayList;

public class PenCakeItertor implements Iterator {

    ArrayList menuItems;
    int position = 0;

    public PenCakeItertor(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size() && menuItems.get(position) != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) menuItems.get(position);
        position += 1;
        return menuItem;
    }
}
