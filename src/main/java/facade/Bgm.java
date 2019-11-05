package facade;

import Utils.Utils;

public class Bgm {
    private boolean bgm;

    //打开背景音乐
    public void turnBgmOn() {
        bgm = true;
        Utils.logger.info("(" + this.toString() + ") : " + "BGM已打开");
    }

    //关闭背景音乐
    public void turnBgmDown() {
        bgm = false;
        Utils.logger.info("(" + this.toString() + ") : " + "BGM已关闭");
    }
}
