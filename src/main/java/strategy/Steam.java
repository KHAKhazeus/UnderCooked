package strategy;

import Utils.Utils;

public class Steam implements CookMethod {

    //烹调方法
    @Override
    public void cook() {
        Utils.logger.info("(" + this.toString() + ") : " + "米饭已蒸好");
    }
}
