package flyweight;

import Utils.Utils;

/**
 * @description: 原料类，实现为FlyWeight（享元）
 * @author: ldy
 */
public class Ingredient {
    private String name;

    public Ingredient(String name_) {
        name = name_;
    }

    /**
     * @description: 展示该Ingredient的详细信息
     * @author: ldy
     */
    public void show() {
        Utils.logger.info("(" + this.toString() + ") : " + String.format("我是%s", name));
    }

}
