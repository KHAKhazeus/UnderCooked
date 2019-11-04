package lazy_loading;

import Utils.Utils;

public class LazyLoading {
    public static void test() {

        Kitchen kitchen = new Kitchen();
        try {
            // 等待一段时间
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 有订单了，需要厨师
        Utils.logger.info("(LazyLoading):" + "需要Cook");
        Cook cook = kitchen.getCook();
    }
}
