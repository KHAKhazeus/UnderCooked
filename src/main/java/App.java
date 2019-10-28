import bridge.KitchenKnife;


public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");

        KitchenKnife kitchenKnife1 = new KitchenKnife("菜刀1");


        kitchenKnife1.cut();
        kitchenKnife1.chop();
        kitchenKnife1.peel();
    }
}
