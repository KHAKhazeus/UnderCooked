package com.Delegation;

public class Trainee implements MakeFood{
    @Override
    public void makeFood(String food) {
        System.out.println("Trainee is cooking the food: "+food);
    }
}
