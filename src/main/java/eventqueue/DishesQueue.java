package eventqueue;

import java.util.concurrent.LinkedBlockingDeque;

/**
 * @title: DishesQueue
 * @package eventqueue
 * @description: 食物队列类，用于eventqueue pattern中的缓冲区
 * @author: cyy
 * @date: 2019-11-02 23:52
 * @version: V1.0
 */
public class DishesQueue {
    public LinkedBlockingDeque<Dish> dishes;

    public DishesQueue() {
        dishes = new LinkedBlockingDeque<Dish>();
    }

    public void push(Dish o) {
        /**
         *@title: push
         *@description: 将一个dish压入队末
         *@author: cyy
         *@date: 2019-11-03 1:01
         *@param: [o]
         *@return: void
         */

        try {
            dishes.put(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Dish get() {
        /**
         *@title: get
         *@description: 将一个dish从队首取出
         *@author: cyy
         *@date: 2019-11-03 1:04
         *@param: []
         *@return: eventqueue.Dish
         */

        try {
            return dishes.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean isEmpty() {
        /**
         *@title: isEmpty
         *@description: 判断该队列是否为空
         *@author: cyy
         *@date: 2019-11-03 1:04
         *@param: []
         *@return: boolean
         */

        return dishes.isEmpty();
    }
}
