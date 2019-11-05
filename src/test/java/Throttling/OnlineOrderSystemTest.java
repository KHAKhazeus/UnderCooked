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
        //创建的时候，系统会自动开启输出线程
        system = new OnlineOrderSystem();
        spammer = new Spammer(system);
        customer = new OrdinaryCustomer(system);
        //客户开始预定
        new Thread(spammer).start();
        new Thread(customer).start();
        //控制模拟时间
        Timer t = new Timer();
        t.schedule(new SimulateTimer(), 10000);
        //等待全部输出完毕
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
            //停止预定系统，不再接受消息
            system.stopOutputting();
            //停止客户的请求
            spammer.flag = false;
            customer.flag = false;
        }
    }

}