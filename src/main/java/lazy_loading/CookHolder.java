package lazy_loading;
import Utils.Utils;

public class CookHolder {
    private Cook cook;

    public CookHolder() {
        Utils.logger.info("(" + this.toString() + "):" + "CookHolder已创建");
    }

    // 第一次需要厨师时，才创建厨师
    public Cook getCook() {
        if (cook == null) {
            cook = new Cook();
        }
        return cook;
    }
}
