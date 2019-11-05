package mediator;

public interface Branch {
    GrandMaster grandMaster = null;
    //新信息输入
    void receiveGrandMaster(Object msg, Object... args);
    //将用户与总信息管理系统进行挂钩
    void register(GrandMaster master);
    //取消挂钩
    void unregister();
}
