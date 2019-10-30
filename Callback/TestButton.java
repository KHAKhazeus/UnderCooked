package com.Callback;

public class TestButton {
    public static void main(String args[]){
        Oven oven = new Oven();
        Button button = new Button(oven);

        button.pushTheButton(10);
    }
}
