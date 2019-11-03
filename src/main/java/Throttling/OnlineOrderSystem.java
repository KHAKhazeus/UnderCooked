package Throttling;

import Utils.Utils;

import java.sql.Timestamp;
import java.util.*;

public class OnlineOrderSystem{

    public OnlineOrderSystem(){
        //open output thread
        outputRunnable = new OutputRunnable();
        outputThread = new Thread(outputRunnable);
        outputThread.start();
    }

    ArrayList<Customer> blackList = new ArrayList<>();

    Thread outputThread = null;

    OutputRunnable outputRunnable = null;

    public void stopOutputting(){
        outputRunnable.flag = false;
    }

    Queue<String> buffer = new LinkedList<String>();

    void receiveMessage(String order, Customer from){
        if (blackList.indexOf(from) == -1){
            buffer.offer(order);
            blackList.add(from);
            Timer t = new Timer();
            BlackListTimer newTimer = new BlackListTimer(from);
            t.schedule(newTimer, 500);
        }
        else{
            buffer.offer("Filtered: " + new Timestamp(System.currentTimeMillis()));
        }
    }

    public class OutputRunnable implements Runnable{
        public Boolean flag = true;
        @Override
        public void run() {
            while(true){
                if (buffer.size() > 0){
                    String now = buffer.poll();
                    Utils.logger.info("(" + this.toString() + ") : " + "Got Order: " + now);
                }
                else if(!flag){
                    break;
                }
                try{
                    Thread.sleep(500);
                }
                catch (Exception e){
                    Utils.logger.error("(" + this.toString() + ") : " + "Got an error because of Thread.Sleep");
                    System.exit(1);
                }
            }
        }
    }

    private class BlackListTimer extends TimerTask{

        Customer blackedCustomer;

        public BlackListTimer(Customer from){
            blackedCustomer = from;
        }

        @Override
        public void run() {
            blackList.remove(blackedCustomer);
        }
    }
}
