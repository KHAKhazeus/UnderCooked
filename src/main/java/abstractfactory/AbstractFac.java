package abstractfactory;

public class AbstractFac {
    public static void test() {
        System.out.println("===========================");
        System.out.println("Testing AbstractFactory:");
        System.out.println("===========================");
        DrinkFactory drinkFactory = new DrinkFactory();
        drinkFactory.getCoffee("大杯");
        drinkFactory.getMilk("中杯");
        drinkFactory.getJuice("小杯");
    }
}
