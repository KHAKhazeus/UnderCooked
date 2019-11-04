package DirtyFlag;

import Utils.Utils;

import java.util.Date;

/**
 * @description: 电子菜单类。该类实现了DirtyFlag设计模式
 * @author: ldy
 */
public class ElectronicMenu {
    protected boolean isDirty = true;
    private String content;


    /**
     * @description: 在需要更新时调用，更新菜单内容
     * @author: ldy
     */
    private void update() {
        Utils.logger.info("(" + this.toString() + ") : " + "正在从服务器获取数据\n.\n.\n.\n");
        try {
            Thread.currentThread().sleep(3000);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
        Utils.logger.info("(" + this.toString() + ") : " + "更新完毕\n");
        Date date = new Date();
        content = String.format("更新时间：%tc", date);
        isDirty = false;
    }

    /**
     * @description: 显示菜单内容。如果菜单需要更新(isDirty==true),则现调用update
     * @author: ldy
     */
    public void show() {
        if (isDirty) {
            update();
        }
        Utils.logger.info("(" + this.toString() + ") : " + "(" + this.toString() + ") : ");
        System.out.println(content);
    }

    /**
     * @description: 设置isDirty为真，即需要更新
     * @author: ldy
     */
    public void menuChange() {
        isDirty = true;
    }
}
