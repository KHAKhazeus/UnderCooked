package throttling;

import Utils.Utils;
import org.junit.jupiter.api.Test;

import java.util.Timer;
import java.util.TimerTask;

class ThrottlingTest {

    @Test
    void main() {
//        try{
//            Thread.sleep(1000);
//        }
//        catch (Exception e){
//            Utils.logger.error("(" + this.toString() + ") : " + e.getMessage());
//        }
        new Throttling().test();
    }
}