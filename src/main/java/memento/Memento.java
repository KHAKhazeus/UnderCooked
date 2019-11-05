package memento;

public class Memento {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing Memento:");
        System.out.println("===========================");

        var memento = new menu();
        menu.Volume(20);
        menu.Save();
    }
}
