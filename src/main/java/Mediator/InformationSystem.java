package mediator;

import Utils.Utils;

//抽象类，对分支进行包装，成为通用的信息系统，统一使用INFOTYPE类型进行信息传递
abstract public class InformationSystem<INFOTYPE> implements Branch{
    InformationMaster<INFOTYPE> grandMaster = null;

    abstract public void inputMessage(INFOTYPE msg);

    //收到新消息
    @Override
    public void receiveGrandMaster(Object msg, Object... args) {
        //assume that grandmaster is dependable
        Utils.logger.info('(' + this.toString() + ") : " + "received message: " + " " + args[1].toString() + " " +msg.toString());
    }

    //绑定总控系统
    @Override
    public void register(GrandMaster master) {
        if (master != null){
            master.addToBranches(this);
        }
        if (!(master instanceof InformationMaster)){
            Utils.logger.error('(' + this.toString() + ") : " + "register grandmaster failure, type not correct, got type: " + master.getClass());
        }
        else{
            grandMaster = (InformationMaster<INFOTYPE>) master;
        }
    }

    //将总控系统脱绑
    @Override
    public void unregister() {
        if (grandMaster == null){
            Utils.logger.info('(' + this.toString() + ") : " + "cannot remove grandmaster due to null");
        }
        else{
            grandMaster.removeFromBranches(this);
            Utils.logger.info('(' + this.toString() + ") : " + "successfully removed grandmaster");
        }

    }
}
