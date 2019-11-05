package templatemethod;

import flyweight.Ingredient;
import Utils.Utils;

import java.util.ArrayList;
import java.util.List;


/**
 * @description: 一道菜的抽象父类
 * @author: ldy
 */
public abstract class Dish {
    protected List<Ingredient> ingredients = new ArrayList<Ingredient>();
    private Quality quality = Quality.GOOD;
    private Temprature temperature;
    private Freshness freshness;

    abstract public String getName();

    /**
     * @description: 显示这道菜的原材料列表。原材料的实现使用FlyWeight
     * @author: ldy
     */
    public void showIngredient() {
        for (int i = 0; i != ingredients.size(); ++i
        ) {
            Utils.logger.info("(" + this.toString() + ") : " + String.format("原料%d：", i + 1));
            ingredients.get(i).show();
        }
    }

    /**
     * @description: 产生这道菜食用后对应的效果
     * @author: ldy
     */
    protected abstract void produceEatEffect();

    /**
     * @description: 食用一道菜
     * @author: ldy
     */
    public void eat() {
        produceEatEffect();
    }

    /**
     * @description: 打印这道菜自身的完整信息
     * @author: ldy
     */
    public void printFullInfo() {
        Utils.logger.info("(" + this.toString() + ") : " + "我是" + this.getName() + ",我的状态是" + freshness.toString() +
                "," + quality.toString() + "," + temperature.toString());
    }

    /**
     * @description: 设置这道菜的质量
     * @author: ldy
     * @param: [q]质量
     */
    public void setQuality(Quality q) {
        this.quality = q;
    }

    /**
     * @description: 设置这道菜的温度
     * @author: ldy
     * @param: [t]温度
     */
    public void setTemperature(Temprature t) {
        this.temperature = t;
    }

    /**
     * @description: 设置这道菜的新鲜度
     * @author: ldy
     * @param: [freshness]新鲜度
     */
    public void setFreshness(Freshness freshness) {
        this.freshness = freshness;
    }
}

