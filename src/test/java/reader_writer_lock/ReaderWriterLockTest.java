package reader_writer_lock;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ReaderWriterLockTest {
    @Test
    void main() {
        Pot pot = new Pot();
        int[] typeArray = new int[]{0, 0, 1, 0, 1, 0};
        ArrayList<Cook> cooks = new ArrayList<>();
        for (int i: typeArray) {
            cooks.add(new Cook(i, pot));
        }
        for (Cook cook: cooks) {
            cook.start();
        }
    }
}