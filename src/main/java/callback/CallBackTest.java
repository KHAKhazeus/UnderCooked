package callback;

public class CallBackTest {
    public static void main(String args[]){
        Oven oven = new Oven();
        Button button = new Button(oven);

        button.pushTheButton(10);

    }
}
