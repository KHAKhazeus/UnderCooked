package mediator;

import Utils.Utils;

abstract public class InformationSystem<INFOTYPE> implements Branch{
    //exposed interface
    InformationMaster<INFOTYPE> grandMaster = null;
    abstract public void inputMessage(INFOTYPE msg);
    @Override
    public void receiveGrandMaster(Object msg, Object... args) {
        //assume that grandmaster is dependable
        Utils.logger.info('(' + this.toString() + ") : " + "received message: " + " " + args[1].toString() + " " +msg.toString());
    }

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
