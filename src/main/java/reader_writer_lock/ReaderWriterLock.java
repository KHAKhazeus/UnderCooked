package reader_writer_lock;

import java.util.ArrayList;

public class ReaderWriterLock {
    public static void test() {
        Pot pot = new Pot();
        // 六个厨师都想要访问锅
        int[] typeArray = new int[]{0, 0, 1, 0, 1, 0};
        ArrayList<Cook> cooks = new ArrayList<>();
        for (int i: typeArray) {
            cooks.add(new Cook(i, pot));
        }
        // 循环速度足够快，再加上执行操作所需的时间，可以模拟同时访问
        for (Cook cook: cooks) {
            cook.start();
        }
    }
}
