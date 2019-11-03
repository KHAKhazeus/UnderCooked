/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @className: ActiveObjectTest
 * @packageName: ActiveObject
 * @description: 测试类，用来测试ActiveObject这一设计模式
 * @data: 2019-11-1
 **/
package ActiveObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActiveObjectTest {
    @Test
    void main(){
        System.out.println("Testing ActiveObject");

        /**
         * 初始化一个公告牌实例
         */
        NotifyBoard notifyBoard =   new NotifyBoard();

        /**
         * 发布公告
         */
        try {
            notifyBoard.changeNotifyBoard("Watch out the time!");

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        /**
         * 清空公告
         */
        try {
            notifyBoard.clearNotifyBoard();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        /**
         * 关闭公告
         */
        try {
            notifyBoard.shutDownNotifyBoard();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}