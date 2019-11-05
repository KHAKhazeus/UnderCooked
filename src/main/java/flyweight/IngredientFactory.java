package flyweight;

import java.util.HashMap;

/**
 * @description: 实现FlyWeight所必需的特殊工厂类。该类仅在生产每个类别的第一个实例时调用构造函数，其余全部返回引用
 * @author: ldy
 */
public class IngredientFactory {
    static private IngredientFactory instance;
    private HashMap<String, Ingredient> pool = new HashMap<String, Ingredient>();

    private IngredientFactory() {
    }

    /**
     * @description: 单例模式返回唯一实例
     * @author: ldy
     */
    static public IngredientFactory getInstance() {
        if (instance == null) {
            instance = new IngredientFactory();
        }
        return instance;
    }

    /**
     * @description: 根据name获取对应的Ingredient对象。如果该对象已被实例化过，则返回其引用，否则创造一个新的
     * 并加入到pool中
     * @author: ldy
     */
    public Ingredient getIngredient(String name) {
        if (pool.get(name) == null) {
            Ingredient ingredient = new Ingredient(name);
            pool.put(name, ingredient);
        }
        return pool.get(name);
    }

}
