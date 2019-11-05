package publishsubscriber;
// 食材工厂接口的实现
// 设计模式:
// 发布订阅模式(pub-sub)
// 不可变对象模式(immutable)
// Future/Promise 模式

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.List;

// 发布订阅模式
public class Generators extends Thread implements Generator, Callable<String> {
    private Thread t;
    private final String GenName; // 不可变对象模式
    private List<Cook> cooksList = new ArrayList<Cook>(); // 订阅者

    Generators(String name) {
        GenName = name;
        System.out.println("Creating " + GenName);
    }

    public void addCook(Cook cook) {
        cooksList.add(cook);
    }

    @Override
    public void deleteCook(Cook cook) {
        cooksList.remove(cook);
    }

    // Future/Promise 模式
    @Override
    public String call() throws Exception {
        for (Cook list : cooksList) {
            list.UpdateMsg(this.GenName);
        }
        return GenName;
    }

    public void run() {
        System.out.println("Running " + GenName);
        try {
            for (Cook list : cooksList) {
                list.UpdateMsg(this.GenName);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + GenName + " interrupted.");
        }
        System.out.println("Thread " + GenName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + GenName);
        if (t == null) {
            t = new Thread(this, GenName);
            t.start();
        }
    }
}
