/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @className: StateTest
 * @packageName: State
 * @description: 测试类，用来测试State这一设计模式
 * @data: 2019-11-1
 **/
package State;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StateTest {
    @Test
    void main(){
        System.out.println("Testing State");
        /**
         * 初始化一个鸡肉实例
         */
        Chicken chicken = new Chicken();

        /**
         * 打印一个鸡肉食材创建
         */
        System.out.println("Chicken:Chicken():("+chicken.toString()+"):chicken has been created");

        /**
         * 打印鸡肉的切、煎之后各个状态变化
         */
        for(int i=0; i<8; ++i){
            if(!chicken.isOverCooked()){
                chicken.cut();
                chicken.fry();
            }
            else{
                break;
            }
        }
        chicken.cut();
        chicken.fry();
    }
}