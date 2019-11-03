package command;
import Utils.Utils;

public class Cook {
    public void cook(String order) {
        Utils.logger.info("(" + this.toString() + "):" + "执行操作：" + order);
    }
}
