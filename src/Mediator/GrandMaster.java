package Mediator;

import java.util.ArrayList;

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
    ArrayList branches = null;
    ArrayList buffer = null;
    void addToBranches(Branch branch);
    void inform(Object msg, Object... args);
    void removeFromBranches(Branch branch);
    void receive(Object msg, Object... args);
}
