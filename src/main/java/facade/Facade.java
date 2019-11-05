package facade;

public class Facade {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing Facade:");
        System.out.println("===========================");

        Menu menu=new Menu();
        menu.clickPause();
        menu.clickResume();
        menu.clickBgmDown();
        menu.clickBgmOn();

    }
}
