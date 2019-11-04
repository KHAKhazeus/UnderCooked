package lazy_loading;
import Utils.Utils;

public class Kitchen {
    // 仅保留厨师职位，不需要厨师时为空
    private CookHolder cookHolder;

    public Kitchen() {
        Utils.logger.info("(" + this.toString() + "):" + "Kitchen已创建");
        this.cookHolder = new CookHolder();
    }

    public Cook getCook() {
        return cookHolder.getCook();
    }
}
