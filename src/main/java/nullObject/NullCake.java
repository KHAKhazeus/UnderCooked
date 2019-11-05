package nullObject;

import Utils.Utils;

public class NullCake implements Cake {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public void serve() {
        Utils.logger.info("("+this.toString()+") : ");
        System.out.println("抱歉，无法提供您所点食物!");
    }
}
