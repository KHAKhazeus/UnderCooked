package throttling;

import Utils.Utils;
import org.junit.jupiter.api.Test;

import java.util.Timer;
import java.util.TimerTask;

class ThrottlingTest {

    @Test
    void main() {
        new Throttling().test();
    }
}