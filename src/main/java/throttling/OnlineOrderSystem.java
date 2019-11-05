package throttling;

import Utils.Utils;

import java.sql.Timestamp;
import java.util.*;

public class OnlineOrderSystem{

    public OnlineOrderSystem(){
        //创建属于自己的输出线程
        outputRunnable = new OutputRunnable();
        outputThread = new Thread(outputRunnable);
        outputThread.start();
    }

    ArrayList<Customer> blackList = new ArrayList<>();

    Thread outputThread = null;

    OutputRunnable outputRunnable = null;

    //通过FLAG来控制输出线程的关闭
    public void stopOutputting(){
        outputRunnable.flag = false;
    }

    //消息队列
    Queue<String> buffer = new LinkedList<String>();

    //接受消息，并将客户暂时加入黑名单，启动计时器屏蔽其这段时间的消息
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

    //内部类：输出线程，防止阻塞主线程，不断检查是否有收到的新信息并进行输出
    public class OutputRunnable implements Runnable{
        public Boolean flag = true;
        @Override
        public void run() {
            while(true){
                if (buffer.size() > 0){
                    //对列中还有未处理的消息
                    String now = buffer.poll();
                    Utils.logger.info("(" + this.toString() + ") : " + "Got Order: " + now);
                }
                else if(!flag){
                    //全部处理完毕，并且外部程序请求终止系统
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

    //内部类：计时器，到一定时间之后将对象移除黑名单
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
