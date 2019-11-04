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
        System.out.println("Sorry, we don't have the food you ordered!");
    }
}
