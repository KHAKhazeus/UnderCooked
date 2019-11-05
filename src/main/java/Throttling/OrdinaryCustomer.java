package Throttling;

import Utils.Utils;

import java.sql.Timestamp;

public class OrdinaryCustomer implements Customer, Runnable{

    private OnlineOrderSystem commonSystem;

    public Boolean flag = true;

    public OrdinaryCustomer(OnlineOrderSystem system){
        commonSystem = system;
    }

    @Override
    public void changeSystem(OnlineOrderSystem system){
        commonSystem = system;
    }

    @Override
    public void placeOrder(String order) {
        order += new Timestamp(System.currentTimeMillis());
        commonSystem.receiveMessage(order, this);
    }

    @Override
    public void run() {
        String order = "Customer ordered Something! Please respond!";
        while(flag){
            placeOrder(order);
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                Utils.logger.error("(" + this.toString() + ") : " + "Got an error because of Thread.Sleep");
                System.exit(1);
            }
        }
    }
}
