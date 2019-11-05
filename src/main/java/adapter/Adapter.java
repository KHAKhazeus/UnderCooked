package adapter;

public class Adapter {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing Adapter:");
        System.out.println("===========================");

        CookingPot cookingPot = new CookingPot();
        cookingPot.cook("鸡蛋", 50);
        cookingPot.cook("肉", 50);
    }
}
