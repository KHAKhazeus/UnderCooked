package Mediator;

public interface Branch {
    GrandMaster grandMaster = null;
    void receiveGrandMaster(Object msg, Object... args);
    void register(GrandMaster master);
    void unregister();
}
