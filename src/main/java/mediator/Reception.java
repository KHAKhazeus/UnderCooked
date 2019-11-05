package mediator;

import Utils.Utils;

//前台信息台
public class Reception<INFOTYPE> extends InformationSystem<INFOTYPE> {
    public void inputMessage(INFOTYPE msg) {
        Utils.logger.info('(' + this.toString() + ") : " + "收到新的消息，准备向总控传递: " + msg.toString());
        callGrandMaster(msg, this);
    }

    private void callGrandMaster(INFOTYPE msg, Object... args) {
        Utils.logger.info('(' + this.toString() + ") : " + "向总控传递消息: " + msg.toString());
        grandMaster.receive(msg, args[0], "前台");
    }
}
