package specification;

import java.util.concurrent.LinkedBlockingDeque;

/**
 * @title: DishesQueue
 * @package specification
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
        try {
            dishes.put(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Dish get() {
        try {
            return dishes.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean isEmpty() {
        return dishes.isEmpty();
    }
}
