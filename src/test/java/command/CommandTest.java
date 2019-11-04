package command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandTest {
    @Test
    void main() {
        Waiter waiter = new Waiter();
        Cook cook = new Cook();

        // 服务员添加订单
        waiter.addOrder(new BakingOrder(cook));
        // 服务员执行订单
        waiter.executeOrder();
    }
}