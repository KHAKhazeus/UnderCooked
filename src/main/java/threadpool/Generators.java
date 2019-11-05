package threadpool;
// 食材工厂接口的实现
// 设计模式:
// 发布订阅模式(pub-sub)
// 不可变对象模式(immutable)
// Future/Promise 模式

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


// 发布订阅模式
public class Generators implements Generator, Callable<String> {
    private final String GenName; // 不可变对象模式
    private List<Cook> cooksList = new ArrayList<Cook>(); // 订阅者

    Generators(String name) {
        GenName = name;
        System.out.println( "Generators:Generators:("+ this.toString()+ "):Creating immutable" + GenName);
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
        System.out.println("GenName:call:("+ this.toString() +"):future promise call");
        for (Cook list : cooksList) {
            list.UpdateMsg(this.GenName);
        }
        return GenName;
    }

    // thead pool
    public void notifyAll(int max) {
        System.out.println("GenName:call:("+ this.toString() +"):thead pool");
        ExecutorService service = Executors.newFixedThreadPool(max);
        service.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    for (Cook list : cooksList) {
                        list.UpdateMsg(GenName);
                        Thread.sleep(50);
                    }
                } catch (InterruptedException e) {
                    System.out.println("GenName:notifyAll:("+ this.toString() +"):Thread " + GenName + " interrupted.");
                }
                System.out.println("GenName:notifyAll:("+ this.toString() +"):Thread " + GenName + " exiting.");
            }
        });
        service.shutdownNow();
    }
}
