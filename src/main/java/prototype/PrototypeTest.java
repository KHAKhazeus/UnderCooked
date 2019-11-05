package prototype;

import java.util.Vector;

/**
 * @title: PrototypeTest
 * @package prototype
 * @description: prototype测试类
 * @author: cyy
 * @date: 2019-11-02 23:44
 * @version: V1.0
*/
public class PrototypeTest {

    public static void test() {
        System.out.println("Test Prototype");
        Basket manager = Basket.getInstance();
        VegetableType input[] = new VegetableType[]{VegetableType.Spinach, VegetableType.Tomato, VegetableType.Potato, VegetableType.Potato, VegetableType.Tomato};
        Vector<Vegetable> vec = new Vector<Vegetable>();

        /**
         * 寻找并克隆与列表中类型相同的原型
         */
        for (VegetableType in : input) {
            vec.add(manager.findAndClone(in));
        }
        for (Vegetable e : vec) {
            e.display();
        }
    }
}
