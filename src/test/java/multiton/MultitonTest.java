package multiton;

import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class MultitonTest {
    @Test
    void main(){
        System.out.println("Test Multiton");
        /**
         * 将有限的锅获取完毕，再归还再获取
         */
        Vector<Pot> vec = new Vector<Pot>();
        for (int i = 0; i < 7; ++i) {
            vec.add(Pot.getInstance());
        }
        vec.get(2).giveBack();
        Pot.getInstance();
    }
}