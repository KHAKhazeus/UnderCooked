package eventqueue;

/**
 * @title: Test
 * @package eventqueue
 * @description:eventqueue测试类
 * @author: cyy
 * @date: 2019-11-03 0:06
 * @version: V1.0
*/
public class EventQueue {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing EventQueue:");
        System.out.println("===========================");

        System.out.println("Test EventQueue");
        DishesQueue q = new DishesQueue();


        /**
         * 实例化厨师与侍者
         */
        var cook1 = new Chef("a");
        var cook2 = new Chef("b");
        var cook3 = new Chef("c");
        var cook4 = new Chef("d");
        var waiter = new Waiter("a");
        var waiter2=new Waiter("b");

        /**
         * 将厨师与侍者连接出菜窗口
         */
        cook1.setWindow(q);
        cook2.setWindow(q);
        cook3.setWindow(q);
        cook4.setWindow(q);
        waiter.setWindow(q);
        waiter2.setWindow(q);

        /**
         * 创建并启动线程
         */
        Thread t1 = new Thread(cook1);
        Thread t2 = new Thread(cook2);
        Thread t3 = new Thread(cook3);
        Thread t4 = new Thread(cook4);
        Thread t5 = new Thread(waiter);
        Thread t6=new Thread(waiter2);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

        /**
         * 让主线程等待子线程执行完毕
         */
        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
