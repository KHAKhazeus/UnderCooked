package readerwriterlock;

import java.util.Random;
import Utils.Utils;

// 多个线程竞争访问的共享区域
public class Pot {
    private int content = new Random().nextInt();
    private Lock lock = new Lock();

    public void look() {
        // 读上锁
        lock.readLock();
        Utils.logger.info("(" + this.toString() + "):" + "一个新的厨师正在观察锅");
        try {
            // 通过睡眠来模拟观察的耗时
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            // 返回读操作的内容
            Utils.logger.info("(" + this.toString() + "):" + String.valueOf(this.content));
            // 读解锁
            lock.readUnlock();
        }
    }

    public void operate(int content) {
        // 写上锁
        lock.writeLock();
        Utils.logger.info("(" + this.toString() + "):" + "一个新的厨师正在操作锅");
        try {
            // 通过睡眠来模拟操作的耗时
            Thread.sleep(3000);
            this.content = content;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // 写解锁
            lock.writeUnlock();
        }
    }
}
