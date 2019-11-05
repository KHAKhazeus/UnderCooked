package strategy;

import Utils.Utils;

public class Vegetable extends Material {
    public Vegetable() {
        Utils.logger.info("(" + this.toString() + ") : " + "生成一份蔬菜");
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
        cookMethod = new NoCook();
        cookMethod.cook();
    }
}
