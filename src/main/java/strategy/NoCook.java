package strategy;

import Utils.Utils;

public class NoCook implements CookMethod {
    //切碎方法
    @Override
    public void cook() {
        Utils.logger.info("(" + this.toString() + ") : " + "蔬菜不需要烹饪");
    }
}
