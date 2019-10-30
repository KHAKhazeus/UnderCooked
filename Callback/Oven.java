package com.Callback;

import java.util.TreeMap;
import java.util.Date;

public class Oven {
    public void start(int time,Button button){
        System.out.println("Start baking...");

        countDown(time);

        this.callback(button);
    }
    private void countDown(int time){

        while (time>0) {
            System.out.println(time+"s");
            //休眠一秒钟
            try {
                Thread.sleep(1000);
                time--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void callback(Button button){
        button.popUp();
    }
}
