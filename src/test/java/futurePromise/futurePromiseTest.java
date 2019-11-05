package futurePromise;

import java.util.concurrent.FutureTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class futurePromiseTest {
    @Test
    void main() {
        System.out.println("Testing future/promise");

        Cooks cook1 = new Cooks("厨师1");
        Cooks cook2 = new Cooks("厨师2");
        Cooks cook3 = new Cooks("厨师3");
        Cooks cook4 = new Cooks("厨师4");

        Generators gen1 = new Generators("apple");
        Generators gen2 = new Generators("pear");

        gen1.addCook(cook1);
        gen1.addCook(cook2);
        gen1.addCook(cook3);
        gen1.addCook(cook4);

        gen2.addCook(cook1);
        gen2.addCook(cook2);
        gen2.addCook(cook3);
        gen2.addCook(cook4);

        gen1.start();
        FutureTask<String> ft = new FutureTask<>(gen2);
        new Thread(ft).start();
    }
}
