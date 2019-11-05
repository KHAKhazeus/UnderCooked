package dependency_injection;
import Utils.Utils;

public class Cook {
    // 依赖注入
    public void cook(Dish dish) {
        Utils.logger.info("(" + this.toString() + "):" +"制作 " + dish.getName());
    }
}
