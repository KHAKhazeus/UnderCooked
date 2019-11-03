package proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Vector;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @title: Cook
 * @package proxy
 * @description: 厨师基类， 用于 proxy,specification,eventqueue pattern
 * @author: cyy
 * @date: 2019-11-02 23:49
 * @version: V1.0
*/
abstract public class Cook implements Runnable {
    public static final Logger logger = LogManager.getLogger();

    /**
     * 厨师名
     */
    public String name;

    /**
     * 厨师忙碌状态标识符
     */
    public boolean isBusy;

    /**
     * 厨师特长数组
     */
    public Vector<SpecialityType> specialities;

    /**
     * 厨师等级
     */
    public LevelType level;

    /**
     * 厨师对应的出菜窗口
     */
    private DishesQueue dishes;
    static private Lock lock = new ReentrantLock();
    static private int ref = 0;

    abstract public void dealChores(String method
                                    /**
     *@title: dealChores
     *@description: 相当于cook与commis函数的接口
     *@author: cyy
     *@date: 2019-11-03 0:23
     *@param: [method]
     *@return: void
     */
    );

    public Cook(String n) {
        name = n;
        isBusy = false;
        level = LevelType.Primary;
        specialities = new Vector<SpecialityType>();
    }

    public Cook(String n, Boolean b, LevelType l, SpecialityType[] s) {
        name = n;
        isBusy = b;
        level = l;
        specialities = new Vector<SpecialityType>();
        for (SpecialityType e : s) {
            specialities.add(e);
        }
    }

    public void setWindow(DishesQueue q) {
        /**
         *@title: setWindow
         *@description: 设置食物队列引用
         *@author: cyy
         *@date: 2019-11-03 0:16
         *@param: [q]
         *@return: void
         */

        dishes = q;
    }

    @Override
    public void run() {
        /**
         *@title: run
         *@description: 实现Runable方法，进行多线程测试，cook向食物队列加入生产完成的食物
         *@author: cyy
         *@date: 2019-11-03 0:19
         *@param: []
         *@return: void
         */

        try {
            lock.lock();
            try {
                var o = new Dish(ref++);
                dishes.push(o);
                logger.info(String.format("(%s): 厨师%s做出菜%d", this.toString(), this.name, o.id));
                Thread.sleep(500);
            } finally {
                lock.unlock();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
