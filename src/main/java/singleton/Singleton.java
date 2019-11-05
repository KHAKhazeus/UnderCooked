package singleton;

public class Singleton {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing Singleton:");
        System.out.println("===========================");

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
