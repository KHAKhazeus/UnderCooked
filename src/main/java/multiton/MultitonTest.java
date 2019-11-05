package multiton;

import java.util.Vector;

/**
 * @title: MultitonTest
 * @package multiton
 * @description: multiton测试类
 * @author: cyy
 * @date: 2019-11-03 0:05
 * @version: V1.0
*/
public class MultitonTest {
    public static void test() {
        System.out.println("Test Multiton");
        /**
         * 将有限的锅获取完毕，再归还再获取
         */
        Vector<Pot> vec = new Vector<Pot>();
        for (int i = 0; i < 7; ++i) {
            vec.add(Pot.getInstance());
        }
        vec.get(2).giveBack();
        Pot.getInstance();
    }
}
