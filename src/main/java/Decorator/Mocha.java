package Decorator;

import Utils.Utils;

public class Mocha extends DrinkDecorator {

    public Mocha(Drink drink){
        super(drink);
    }

    @Override
    public String getDescription() {
        

       return super.getDescription()+" + Mocha";
    }
}
