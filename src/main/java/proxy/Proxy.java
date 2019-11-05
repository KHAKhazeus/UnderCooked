package proxy;

/**
 * @title: ProxyTest
 * @package proxy
 * @description: proxy测试类
 * @author: cyy
 * @date: 2019-11-02 23:54
 * @version: V1.0
*/
public class Proxy {

    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing Proxy:");
        System.out.println("===========================");

        /**
         * 创建主厨与助手实例
         */
        Chef chef = new Chef("大厨");
        Commis c1 = new Commis("小李");
        Commis c2 = new Commis("小张");
        /**
         * 使主厨拥有助手
         */
        chef.addCommis(c1);
        chef.addCommis(c2);
        /**
         * 主厨拜托助手处理杂务
         */
        chef.dealChores("dish");
    }
}
