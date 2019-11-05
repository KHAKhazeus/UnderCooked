package Throttling;

import Utils.Utils;

import java.sql.Timestamp;

public class Spammer implements Customer, Runnable {

    private OnlineOrderSystem commonSystem;

    public Boolean flag = true;

    public Spammer(OnlineOrderSystem system){
        commonSystem = system;
    }

    //更改系统
    @Override
    public void changeSystem(OnlineOrderSystem system){
        commonSystem = system;
    }

    //下订单
    @Override
    public void placeOrder(String order) {
        order += new Timestamp(System.currentTimeMillis());
        commonSystem.receiveMessage(order, this);
    }

    //恶意用户每0.2秒发送一个请求
    @Override
    public void run() {
        String order = "Spammer ordered Nothing! Hahaha!";
        while(flag){
            placeOrder(order);
            try{
                Thread.sleep(200);
            }
            catch (Exception e){
                Utils.logger.error("(" + this.toString() + ") : " + "Got an error because of Thread.Sleep");
                System.exit(1);
            }
        }
    }
}
