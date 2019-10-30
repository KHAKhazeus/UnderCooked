package com.Delegation;

public class Kitchen {
    private Chief chief_1 = new Chief();
    private Trainee trainee_1 = new Trainee();
    public void makeFoodByChief(String food){
        this.chief_1.makeFood(food);
    }
    public void makeFoodByTrainee(String food){
        this.trainee_1.makeFood(food);
    }
}
