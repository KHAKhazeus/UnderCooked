package command;
import Utils.Utils;

public class Cook {
    // 完成订单要求的操作
    public void cook(String order) {
        Utils.logger.info("(" + this.toString() + "):" + "执行操作：" + order);
    }
}
