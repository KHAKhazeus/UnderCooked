package nullObject;
import delegation.*;

public class NullObject {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing NullObject:");
        System.out.println("===========================");

        Bakery bakery = new Bakery();

        Cake cake1 = bakery.getCake("hhh");
    }
}
