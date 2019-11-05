package eventqueue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @title: Waiter
 * @package eventqueue
 * @description: 侍者类，用作eventqueue中的消费者
 * @author: cyy
 * @date: 2019-11-03 0:06
 * @version: V1.0
*/
public class Waiter implements Runnable {
    public static final Logger logger = LogManager.getLogger();

    public Waiter(String s) {
        name = s;
    }

    public String name;
    public DishesQueue dishes;

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
     *@description: 实现Runable方法，进行多线程测试，waiter将食物从队列取出
     *@author: cyy
     *@date: 2019-11-03 1:05
     *@param: []
     *@return: void
     */

        while (true) {
            try {
                Thread.sleep(1000);
                if (dishes.isEmpty()) {
                    return;
                }
                var o = dishes.get();
                logger.info(String.format("(%s): 侍者%s拿去菜%d", this.toString(), name, o.id));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
