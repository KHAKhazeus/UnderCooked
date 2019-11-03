package reader_writer_lock;

public class Lock {
    private int readingCook = 0;
    private int waitingCook = 0;
    private int writingCook = 0;

    public synchronized void readLock() {
        while (writingCook > 0 || waitingCook > 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        readingCook++;
    }

    public synchronized void readUnlock() {
        readingCook--;
        notifyAll();
    }

    public synchronized void writeLock() {
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
