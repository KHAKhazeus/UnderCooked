package command;

public class Command {
    public static void test() {
        Waiter waiter = new Waiter();
        Cook cook = new Cook();

        // 服务员添加订单
        waiter.addOrder(new BakingOrder(cook));
        // 服务员执行订单
        waiter.executeOrder();
    }
}
