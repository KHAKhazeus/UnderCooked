package reader_writer_lock;

import java.util.Random;

public class Cook extends Thread {
    private int type;
    private Pot pot;

    public Cook(int type, Pot pot) {
        this.type = type;
        this.pot = pot;
    }

    // 读操作
    private void lookPot() {
        this.pot.look();
    }

    // 写操作
    private void operatePot() {
        this.pot.operate(new Random().nextInt());
    }

    @Override
    public void run() {
        if (type == 0) {
            lookPot();
        }
        else {
            operatePot();
        }
    }
}
