package bridge;


import Utils.Utils;

/**
 * 西冷牛排
 */
public class SirloinSteak extends Steak {
    public SirloinSteak(Doneness doneness) {
        this.name = "西冷牛排";
        this.doneness = doneness;
    }

    @Override
    public void cook() {
        Utils.logger.info(String.format("(%s) : %s", this.toString(), String.format("%s %s", this.name, this.doneness.fry())));
    }
}
