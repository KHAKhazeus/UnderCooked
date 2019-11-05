package facade;

import Utils.Utils;

public class Pause {
    //设置暂停
    public void setPause(){
        Utils.logger.info("(" + this.toString() + ") : " + "游戏已暂停");
    }
}
