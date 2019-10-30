package com.NullObject;

public class TestFood {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        Food food = kitchen.getFood("cake");
        food.serve();

        Food food1 = kitchen.getFood("hhh");
        food1.serve();
    }
}
