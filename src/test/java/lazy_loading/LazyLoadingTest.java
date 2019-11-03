package lazy_loading;

import Utils.Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LazyLoadingTest {
    @Test
    void main() {
        Kitchen kitchen = new Kitchen();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Utils.logger.info("(" + this.toString() + "):" + "需要Cook");
        Cook cook = kitchen.getCook();
    }
}