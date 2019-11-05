package strategy;

import Utils.Utils;

public class Rice extends Material {
    public Rice() {
        Utils.logger.info("(" + this.toString() + ") : " + "生成一份米饭");
    }

    //切碎方法
    @Override
    public void toCut() {
        cutMethod = new NoCut();
        cutMethod.cut();
    }

    //烹调方法
    @Override
    public void toCook() {
        cookMethod = new Steam();
        cookMethod.cook();
    }


}
