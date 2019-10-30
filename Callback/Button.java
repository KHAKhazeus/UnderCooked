package com.Callback;

public class Button {

    private boolean state = true;
    private Oven oven = null;


    public Button(Oven oven){
        this.oven = oven;
    }

    public void pushTheButton(int time) throws TimeException{
        if(time<=0){
            TimeException exception=new TimeException("Cannot set time below 0！");
            throw exception;
        }
        this.state = false;
        oven.start(time,this);
    }
    public void popUp(){
        this.state = true;
        System.out.println("Finish!");
    }
}
class TimeException extends RuntimeException{
    public TimeException(){
    }
    public TimeException(String msg){
        super(msg);
    }
}
