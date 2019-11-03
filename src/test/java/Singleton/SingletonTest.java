/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @className: SingletonTest
 * @packageName: Singleton
 * @description: 测试类，用来测试Singleton这一设计模式
 * @data: 2019-11-1
 **/
package Singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {
    @Test
    void main(){
        System.out.println("Testing Singleton");

        /**
         * 初始化两次Clock，看是否为同一实例
         */
        Clock clock1 = Clock.getInstance();
        Clock clock2 = Clock.getInstance();
        if(clock1 ==  clock2) {
            System.out.println("Clock:getInstance:("+clock1.toString()+"):clock1 and clock2 are the same instance.");
        } else {
            System.out.println("Clock:getInstance:("+clock1.toString()+"):clock1 and clock2 are not the same instance.");
        }
    }
}