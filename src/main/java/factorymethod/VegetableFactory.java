package factorymethod;

import Utils.Utils;
public class VegetableFactory implements MaterialFactory {
    @Override
    public Material newMaterial(String name) {
        if (name.equals("tomato")){
            Utils.logger.info("(" + this.toString() + ") : " + "从工厂拿出一份番茄");
            return new Vegetable();
        }else if(name.equals("potato")){
            Utils.logger.info("(" + this.toString() + ") : " + "从工厂拿出一份土豆");
            return new Vegetable();
        } else {
            return null;
        }
    }
}
