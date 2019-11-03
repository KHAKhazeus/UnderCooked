package reader_writer_lock;

import java.util.Random;
import Utils.Utils;

public class Pot {
    private int content = new Random().nextInt();
    private Lock lock = new Lock();

    public void look() {
        lock.readLock();
        Utils.logger.info("(" + this.toString() + "):" + "一个新的厨师正在观察锅");
        try {
            // 通过睡眠来模拟观察的耗时
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            Utils.logger.info("(" + this.toString() + "):" + String.valueOf(this.content));
            lock.readUnlock();
        }
    }

    public void operate(int content) {
        lock.writeLock();
        Utils.logger.info("(" + this.toString() + "):" + "一个新的厨师正在操作锅");
        try {
            // 通过睡眠来模拟操作的耗时
            Thread.sleep(3000);
            this.content = content;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.writeUnlock();
        }
    }
}
