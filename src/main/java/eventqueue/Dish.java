package eventqueue;

/**
 * @title: Dish
 * @package eventqueue
 * @description: 食物类，用作eventqueue pattern中的产品
 * @author: cyy
 * @date: 2019-11-02 23:50
 * @version: V1.0
 */
public class Dish {
    static private int ref = 0;
    public int id;

    public Dish(int i) {
        id = i;
    }
}
