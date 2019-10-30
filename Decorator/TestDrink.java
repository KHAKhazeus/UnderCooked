package com.Decorator;

public class TestDrink {
    public static void main(String args[]){
        Drink drink = new HouseBlend();
        System.out.println(drink.getDescription());

        drink= new Mocha(drink);
        System.out.println(drink.getDescription());
        drink = new Mocha(drink);
        System.out.println(drink.getDescription());
        drink = new Chocolate(drink);
        System.out.println(drink.getDescription());

        Drink milk = new Milk();
        milk = new Mocha(milk);
        System.out.println(milk.getDescription());
    }
}
