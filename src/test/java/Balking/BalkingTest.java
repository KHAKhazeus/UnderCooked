/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @className: BalkingTest
 * @packageName: Balking
 * @description: 测试类，用来测试Balking这一设计模式
 * @data: 2019-11-1
 **/
package Balking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalkingTest {
    @Test
    void main(){
        System.out.println("Testing Balking");
        /**
         * 初始化一个面粉实例
         */
        Flour flour = new Flour();

        /**
         * 打印一个面粉食材创建
         */
        System.out.println("Flour:Flour():("+flour.toString()+"):flour has been created");

        /**
         * 打印面粉此刻是否可以搅拌和加鸡蛋
         */
        flour.addEgg();
        flour.stir();

        /**
         * 打印stirred的面粉是否可以搅拌和加鸡蛋
         */
        flour.addEgg();
        flour.stir();

        /**
         * 打印UnStirable的面粉是否可以搅拌和加鸡蛋
         */
        flour.addEgg();
        flour.stir();
    }
}