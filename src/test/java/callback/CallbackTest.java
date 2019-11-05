package callback;

import org.junit.jupiter.api.Test;

class CallbackTest {
    @Test
    void main(){
        System.out.println();


        System.out.println("Testing Callback");
        Oven oven = new Oven();
        Button button = new Button(oven);

        button.pushTheButton(1);
    }

}