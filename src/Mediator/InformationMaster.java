package Mediator;

public class InformationMaster extends SingletonXMLMaster {

    private InformationMaster(){ }

    private InformationMaster singleton = null;

    @Override
    public SingletonXMLMaster getInstance(String xml) {
        if (singleton == null) {
            singleton = new InformationMaster();
        }
        singleton.config(xml);
        return singleton;
    }

    @Override
    public void addToBranches(Branch branch) {
        
    }

    @Override
    public void inform(Object msg, Object... args) {

    }

    @Override
    public void removeFromBranches(Branch branch) {

    }

    @Override
    public void receive(Object msg, Object... args) {

    }

    private void config(String xml){
        // output
    }
}
