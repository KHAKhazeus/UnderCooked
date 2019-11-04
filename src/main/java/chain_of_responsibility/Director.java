package chain_of_responsibility;

import Utils.Utils;

public abstract class Director {
    private final int level;
    private Director next = null;

    public Director(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    // 设置上级主管
    public void setNext(Director next) {
        this.next = next;
    }

    protected abstract void cook();

    // 处理订单
    public final void handleOrder(Order order) {
        // 如果可以处理就处理，不能处理则向后传递。
        if (this.level >= order.getLevel()) {
            this.cook();
        } else {
            if (this.next != null) {
                this.next.handleOrder(order);
            }
            else {
                Utils.logger.info("(" + this.toString() + "):" +"能力有限，做不出来这道菜");
            }
        }
    }

}
