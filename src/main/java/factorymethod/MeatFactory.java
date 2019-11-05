package factorymethod;

import Utils.Utils;
public class MeatFactory implements MaterialFactory {
    @Override
    public Material newMaterial(String name) {
        if (name.equals("pork")){
            Utils.logger.info("(" + this.toString() + ") : " + "从工厂拿出一块猪肉");
            return new Meat();
        }else if (name.equals("chicken")){
            Utils.logger.info("(" + this.toString() + ") : " + "从工厂拿出一块鸡肉");
            return new Meat();
        } else {
            return null;
        }
    }
}
