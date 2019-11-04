package command;

// 做法为烤的订单
public class BakingOrder extends Order {

    private Cook cook;

    public BakingOrder(Cook cook) {
        this.cook = cook;
    }

    // 完成订单时，调用厨师进行操作
    @Override
    public void execute() {
        this.cook.cook("烤");
    }
}
