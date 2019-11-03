package Throttling;

import Utils.Utils;
import org.junit.jupiter.api.Test;

import java.util.Timer;
import java.util.TimerTask;

import static org.junit.jupiter.api.Assertions.*;

class OnlineOrderSystemTest {

    OnlineOrderSystem system;
    Spammer spammer;
    OrdinaryCustomer customer;
    @Test
    void main(){
        system = new OnlineOrderSystem();
        spammer = new Spammer(system);
        customer = new OrdinaryCustomer(system);
        new Thread(spammer).start();
        new Thread(customer).start();
        Timer t = new Timer();
        t.schedule(new SimulateTimer(), 10000);
        try{
            system.outputThread.join();
        }
        catch (Exception e){
            Utils.logger.error("(" + this.toString() + ")" + " : " + "extending lifecycle failed!");
        }
    }

    private class SimulateTimer extends TimerTask {

        Customer blackedCustomer;

        @Override
        public void run() {
            system.stopOutputting();
            spammer.flag = false;
            customer.flag = false;
        }
    }

}