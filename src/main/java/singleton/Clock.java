/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @className: Clock
 * @packageName: Singleton
 * @description: 倒计时时钟类，用来展示Singleton这一设计模式
 * @data: 2019-11-1
 **/
package singleton;
public class Clock {
    /**
     * Clock类的属性
     */
    private volatile static Clock instance = new Clock();
    private int timeDown;

    /**
     * @description: 构造函数，初始化timeDown
     * @param: null
     */
    private Clock(){timeDown = 120;}

    /**
     * @description: 返回单例Clock唯一的实例
     * @param: null
     * @return Clock
     */
    public static Clock getInstance(){
        return instance;
    }
}

