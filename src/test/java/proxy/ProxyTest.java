package proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyTest {
    @Test
    void main(){
        System.out.println("Test Proxy");
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