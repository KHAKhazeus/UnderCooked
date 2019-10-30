package com.Delegation;

public class TestFood {
    public static void main(String args[]){
        Kitchen kitchen = new Kitchen();
        kitchen.makeFoodByChief("cake");
        kitchen.makeFoodByTrainee("big cake");
    }
}
