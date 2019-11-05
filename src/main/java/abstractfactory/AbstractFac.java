package abstractfactory;

public class AbstractFac {
    public static void test() {
        System.out.println("===========================");
        System.out.println("Testing AbstractFactory:");
        System.out.println("===========================");
//        System.out.println("AbstractFactory:");
        DrinkFactory drinkFactory = new DrinkFactory();
        drinkFactory.getCoffee("Large");
        drinkFactory.getMilk("Mid");
        drinkFactory.getJuice("Small");
    }
}
