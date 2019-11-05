package callback;
import Utils.Utils;

public class Button {

    private boolean state = true;
    private Oven oven = null;


    public Button(Oven oven){
        this.oven = oven;
    }

    public void pushTheButton(int time) throws TimeException{
        Utils.logger.info("(" +this.toString() +") : ");
        if(time<=0){
            TimeException exception=new TimeException("Cannot set time below 0 !");
            throw exception;
        }
        this.state = false;
        oven.start(time,this);
    }
    public void callback(){
        this.state = true;
        System.out.println("Finish!(Button pop up!)");
    }
    public boolean getState(){
        return state;
    }
}
class TimeException extends RuntimeException{
    public TimeException(){
    }
    public TimeException(String msg){
        super(msg);
    }
}
