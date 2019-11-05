package mediator;

import Utils.Utils;

//采购信息台
public class Procurement<INFOTYPE> extends InformationSystem<INFOTYPE> {

    public void inputMessage(INFOTYPE msg) {
        Utils.logger.info('(' + this.toString() + ") : " + "received new message: " + msg.toString());
        callGrandMaster(msg, this);
    }

    private void callGrandMaster(INFOTYPE msg, Object... args) {
        Utils.logger.info('(' + this.toString() + ") : " + "sending message to grandmaster: " + msg.toString());
        grandMaster.receive(msg, args[0], "Procurement");
    }
}
