package mediator;

/*
    GrandMaster will be the mediator between different subdivisions
    in the Kitchen. Therefore, it will be responsible for the exchange
    rules and exchange tunnels among all branches.
    This will make GrandMaster a really heavy object, which is usually
    not recommended.

    Here we will simulate a GrandMaster which could process every message
    incredibly fast and stable. Moreover, the GrandMaster only has a
    single thread.
 */

public interface GrandMaster {
    //将分支加入系统
    void addToBranches(Branch branch);
    //取消对于分支的管理
    void removeFromBranches(Branch branch);
}
