package strategy;

public class Strategy {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing Strategy:");
        System.out.println("===========================");

        Rice rice = new Rice();
        rice.toCut();
        rice.toCook();

        Meat meat = new Meat();
        meat.toCut();
        meat.toCook();

        Vegetable vegetable = new Vegetable();
        vegetable.toCut();
        vegetable.toCook();
    }
}
