package strategy;

import Utils.Utils;

public class Cut implements CutMethod {
    //切碎方法
    @Override
    public void cut() {

        Utils.logger.info("(" + this.toString() + ") : " + "你的食材已切好");
    }
}
