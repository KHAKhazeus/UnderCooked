package chain_of_responsibility;

public class Order {
    private final int level;

    // 构造函数确定订单完成所需主管等级
    public Order(int level) {
        this.level = level;
    }

    public int getLevel() {
        return this.level;
    }
}
