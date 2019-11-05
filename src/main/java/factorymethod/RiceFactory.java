package factorymethod;

import Utils.Utils;

public class RiceFactory implements MaterialFactory {
    @Override
    public Material newMaterial(String name) {
        if (name.equals("rice")){
            Utils.logger.info("(" + this.toString() + ") : " + "从工厂拿出一份米饭");
            return new Rice();
        }else {
            return null;
        }
    }
}
