package balking;

public class Balking {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing Balking:");
        System.out.println("===========================");
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
