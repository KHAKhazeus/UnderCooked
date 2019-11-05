package adapter;

public class Adapter {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing Adapter:");
        System.out.println("===========================");

//        System.out.println("Adapter:");
        CookingPot cookingPot = new CookingPot();
        cookingPot.cook("egg", 50);
        cookingPot.cook("meat", 50);
    }
}
