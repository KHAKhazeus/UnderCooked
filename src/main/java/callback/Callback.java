package callback;

public class Callback {
    public static void test() {
        System.out.println("===========================");
        System.out.println("Testing Callback:");
        System.out.println("===========================");
        Oven oven = new Oven();
        Button button = new Button(oven);

        button.pushTheButton(1);
    }
}
