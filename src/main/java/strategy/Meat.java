package strategy;

import Utils.Utils;

public class Meat extends Material {
    public Meat() {
        Utils.logger.info("(" + this.toString() + ") : " + "生成一份肉");
    }

    //切碎方法
    @Override
    public void toCut() {
        cutMethod = new Cut();
        cutMethod.cut();
    }

    //烹调方法
    @Override
    public void toCook() {
        cookMethod = new Fry();
        cookMethod.cook();
    }
}
