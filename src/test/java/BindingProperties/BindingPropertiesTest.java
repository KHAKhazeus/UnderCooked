/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @className: BindingPropertiesTest
 * @packageName: BindingProperties
 * @description: 测试类，用来测试BindingProperties这一设计模式
 * @data: 2019-11-1
 **/
package BindingProperties;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BindingPropertiesTest {
    @Test
    void main(){
        System.out.println("Testing BindingProperties");
        /**
         * 初始化两个巧克力蛋糕实例，一个正好在订单中，一个正好不在
         */
        ChocolateCake chocolateCake1 = new ChocolateCake(true);
        ChocolateCake chocolateCake2 = new ChocolateCake(false);


        /**
         * 打印此刻两个巧克力蛋糕的收益
         */
        System.out.println("ChocolateCake:getIncome:("+chocolateCake1.toString()+"):Because chocolateCake1 is in the order, so the income of chocklateCake1 is "
                +Integer.toString(chocolateCake1.getIncome()));
        System.out.println("ChocolateCake:getIncome:("+chocolateCake2.toString()+"):Because chocolateCake2 is not in the order, so the income of chocklateCake2 is "
                +Integer.toString(chocolateCake2.getIncome()));

        /**
         * 调换两个蛋糕是否在订单栏中这一状态
         */
        chocolateCake1.setInOrder(false);
        chocolateCake2.setInOrder(true);

        /**
         * 打印此刻两个巧克力蛋糕的收益
         */
        System.out.println("ChocolateCake:getIncome:("+chocolateCake1.toString()+"):Because chocolateCake1 is removed from the order, so the income of chocklateCake1 is "
                +Integer.toString(chocolateCake1.getIncome()));
        System.out.println("ChocolateCake:getIncome:("+chocolateCake2.toString()+"):Because chocolateCake2 is added into the order, so the income of chocklateCake2 is "
                +Integer.toString(chocolateCake2.getIncome()));
    }
}