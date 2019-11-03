package command;

public class Waiter {
    private Order order;

    public void addOrder(Order order) {
        this.order = order;
    }

    public void executeOrder() {
        // 相当于回调函数
        order.execute();
    }
}
