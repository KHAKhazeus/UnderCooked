package Mediator;

import Utils.Utils;

import java.util.ArrayList;

public class InformationMaster<INFOTYPE> extends SingletonXMLMaster {

    private ArrayList<Branch> branches;

    private ArrayList<INFOTYPE> buffer;

    private InformationMaster(){ }

    private static InformationMaster singleton = null;

    public static <INFOTYPE> SingletonXMLMaster getInstance(String xml) {
        if (singleton == null) {
            singleton = new InformationMaster<INFOTYPE>();
        }
        singleton.config(xml);
        return singleton;
    }

    @Override
    public void addToBranches(Branch branch) {
        branches.add(branch);
        Utils.logger.info('(' + this.toString() + ") : " + "new subdivision loaded: " + branch.toString());
    }

    private void inform(INFOTYPE msg, Object... args) {
        if (!(args[0] instanceof Branch)){
            Utils.logger.error("(" + this.toString() + ") : " + "Rules Violation, ignoring message with no proper sender: " + msg);
        }
        else{
            Branch exception = (Branch) args[0];
            Utils.logger.info('(' + this.toString() + ") : " + "informing other subdivisions");
            for (Branch branch: branches){
                if (branch != exception){
                    branch.receiveGrandMaster(msg, args);
                }
            }
        }
    }

    @Override
    public void removeFromBranches(Branch branch) {
        branches.remove(branch);
        Utils.logger.info('(' + this.toString() + ") : " + "new subdivision removed: " + branch.toString());
    }



    void receive(INFOTYPE msg, Object... args) {
        if (args.length < 2){
            Utils.logger.error("(" + this.toString() + ") : " + "Rules Violation, ignoring message with no sender or name: " + msg);
        }
        else{
            buffer.add(msg);
            Utils.logger.info('(' + this.toString() + ") : " + "received message: " + " " + args[1].toString() + " " + msg.toString() );
            //simulate getting out
            INFOTYPE newMessage = buffer.get(buffer.size() - 1);
            Utils.logger.info('(' + this.toString() + ") : " + "transmitting message: " + newMessage.toString());
            inform(msg, args);
        }
    }

    private void config(String xml){
        Utils.logger.info('(' + this.toString() + ") : " + "loaded with configuration: " + xml);
        branches = new ArrayList<>();
        buffer = new ArrayList<>();
    }
}
