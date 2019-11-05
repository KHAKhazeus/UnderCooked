package strategy;

import Utils.Utils;

public class NoCut implements CutMethod {
    //切碎方法
    @Override
    public void cut() {
        Utils.logger.info("(" + this.toString() + ") : " + "该食材不需要切");
    }
}
