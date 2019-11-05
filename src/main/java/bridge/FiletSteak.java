package bridge;


import Utils.Utils;

/**
 * 菲力牛排
 */
public class FiletSteak extends Steak {
    public FiletSteak(Doneness doneness) {
        this.name = "菲力牛排";
        this.doneness = doneness;
    }

    @Override
    public void cook() {
        Utils.logger.info(String.format("(%s) : %s", this.toString(), String.format("%s %s", this.name, this.doneness.fry())));
    }
}
