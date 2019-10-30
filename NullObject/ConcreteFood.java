package com.NullObject;

public class ConcreteFood implements Food {
    private String name;

    public ConcreteFood(String name){
        this.name = name;
    }

    @Override
    public void serve() {
        System.out.println(name+" is coming!");
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
