package dirtyflag;

import Utils.Utils;

public class DirtyFlag {
    public void test() {

        System.out.println("===========================");
        System.out.println("Testing DirtyFlag:");
        System.out.println("===========================");

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
