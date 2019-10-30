package com.NullObject;

public class Kitchen {
    private Food food;
    public Food getFood(String name){
        switch (name){
            case "cake":
                food = new ConcreteFood(name);
                break;
            case "chicken":
                food = new ConcreteFood(name);
                break;
            default:
                food = new NullFood();
                break;
        }
        return food;
    }
}
