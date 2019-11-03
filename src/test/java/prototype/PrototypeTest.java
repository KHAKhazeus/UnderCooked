package prototype;

import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class PrototypeTest {
    @Test
    void main(){
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