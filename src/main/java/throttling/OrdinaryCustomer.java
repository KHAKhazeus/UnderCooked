package throttling;

import Utils.Utils;

import java.sql.Timestamp;

public class OrdinaryCustomer implements Customer, Runnable{

    private OnlineOrderSystem commonSystem;

    public Boolean flag = true;

    //初始化就绑定系统
    public OrdinaryCustomer(OnlineOrderSystem system){
        commonSystem = system;
    }

    //更换系统
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

    //启动时，正常客户们每1秒发送一个请求
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
