package Mediator;

public interface Branch {
    GrandMaster grandMaster = null;
    void callGrandMaster(Object msg, Object... args);
    void receiveGrandMaster(Object msg, Object... args);
    void register(GrandMaster master);
    void unregister(GrandMaster master);
}
