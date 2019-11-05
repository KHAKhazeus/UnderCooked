package strategy;

import Utils.Utils;

public class Fry implements CookMethod {
    //煎的烹调方法
    @Override
    public void cook() {

        Utils.logger.info("(" + this.toString() + ") : " + "肉已煎好");
    }
}
