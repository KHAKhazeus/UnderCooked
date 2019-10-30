package com.Delegation;

public class Chief implements MakeFood{
    public void makeFood(String food){
        System.out.println("Chief is cooking the food: "+food);
    }
}
