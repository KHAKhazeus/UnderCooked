package mediator;

import Utils.Utils;

//厨房信息台
public class Kitchen<INFOTYPE> extends InformationSystem<INFOTYPE> {

    public void inputMessage(INFOTYPE msg) {
        Utils.logger.info('(' + this.toString() + ") : " + "收到新消息，进行消息传递: " + msg.toString());
        callGrandMaster(msg, this);
    }

    private void callGrandMaster(INFOTYPE msg, Object... args) {
        Utils.logger.info('(' + this.toString() + ") : " + "向总控发送新消息: " + msg.toString());
        grandMaster.receive(msg, args[0], "厨房");
    }
}
