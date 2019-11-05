package readerwriterlock;

import java.util.Random;

public class Cook extends Thread {
    private int type;
    private Pot pot;

    public Cook(int type, Pot pot) {
        // 厨师想做的事
        this.type = type;
        // 厨师想访问的锅
        this.pot = pot;
    }

    // 读操作
    private void lookPot() {
        this.pot.look();
    }

    // 写操作
    private void operatePot() {
        // 随机更新锅里的内容
        this.pot.operate(new Random().nextInt());
    }

    @Override
    public void run() {
        // 根据厨师想做的事，执行不同的操作
        if (type == 0) {
            lookPot();
        }
        else {
            operatePot();
        }
    }
}
