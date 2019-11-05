package DirtyFlag;

import Utils.Utils;
import org.junit.jupiter.api.Test;

class DirtyFlagTest {
    @Test
    void main() {
        Utils.logger.info("(" + this.toString() + ") : " + "Testing Dirty Flag");
        ElectronicMenu menu = new ElectronicMenu();
        Utils.logger.info("(" + this.toString() + ") : " + "第一次访问");
        menu.show();
        Utils.logger.info("(" + this.toString() + ") : " + "第二次访问");
        menu.show();
        Utils.logger.info("(" + this.toString() + ") : " + "数据变更");
        menu.menuChange();
        Utils.logger.info("(" + this.toString() + ") : " + "第三次访问");
        menu.show();
    }

}