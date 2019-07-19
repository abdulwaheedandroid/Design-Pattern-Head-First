package com.example.abdulwaheed.designpatterns.iterator_pattern;

public class DinerMenuItertor implements Iterator {

    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuItertor(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position += 1;
        return menuItem;
    }
}
