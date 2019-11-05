package command;

public class Waiter {
    private Order order;

    // 添加订单
    public void addOrder(Order order) {
        this.order = order;
    }

    // 执行订单，但服务员并不需要知道订单怎么完成
    public void executeOrder() {
        // 相当于回调函数
        order.execute();
    }
}
