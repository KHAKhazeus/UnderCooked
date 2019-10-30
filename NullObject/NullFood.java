package com.NullObject;

public class NullFood implements Food {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public void serve() {
        System.out.println("Sorry, we don't have the food you ordered!");
    }
}
