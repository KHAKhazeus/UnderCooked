package com.Decorator;

public abstract class DrinkDecorator extends Drink{
    private Drink drink;

    DrinkDecorator(Drink drink){
        this.drink = drink;
    }
    @Override
    public String getDescription(){
        return drink.getDescription();
    };

}
