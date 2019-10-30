package com.Decorator;

public class Chocolate extends DrinkDecorator {
    Chocolate(Drink drink){
        super(drink);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" + Chocolate";
    }
}
