package readerwriterlock;

public class Lock {
    // 正在观察的厨师
    private int readingCook = 0;
    // 正在等待并想要操作的厨师
    private int waitingCook = 0;
    // 正在操作的厨师
    private int writingCook = 0;

    public synchronized void readLock() {
        // 如果有正在等待并想要操作的厨师，写优先
        while (writingCook > 0 || waitingCook > 0) {
            try {
                //等待
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        readingCook++;
    }

    public synchronized void readUnlock() {
        readingCook--;
        // 通知正在等待并想要操作的厨师
        notifyAll();
    }

    public synchronized void writeLock() {
        // 添加等待并想要操作的厨师
        waitingCook++;
        while (readingCook > 0 || writingCook > 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                waitingCook--;
            }
        }
        writingCook++;
    }

    public synchronized void writeUnlock() {
        writingCook--;
        notifyAll();
    }
}
