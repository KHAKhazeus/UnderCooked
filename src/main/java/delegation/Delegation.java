package delegation;

public class Delegation {
    public static void test(){

        System.out.println("===========================");
        System.out.println("Testing Delegation:");
        System.out.println("===========================");

        System.out.println();
        System.out.println("Testing Delegation");
        Bakery bakery = new Bakery();
        bakery.getCake("Black Forest Cake");
        bakery.getCake("Buff Cake");
        bakery.getCake("lalala");
    }
}
