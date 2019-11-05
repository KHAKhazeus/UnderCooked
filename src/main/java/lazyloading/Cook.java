package lazyloading;
import Utils.Utils;

// 厨师(需要消耗大量资源的对象)
public class Cook {
    public Cook() {
        Utils.logger.info("(" + this.toString() + "):" + "开始加载Cook");
        try {
            // 通过睡眠来模拟加载需要消耗大量资源的对象
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Utils.logger.info("(" + this.toString() + "):" + "Cook已创建");
    }
}
