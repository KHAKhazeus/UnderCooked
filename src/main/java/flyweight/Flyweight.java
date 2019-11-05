package flyweight;

import Utils.Utils;
import templatemethod.Dish;
import templatemethod.MaPoToDouFu;
import templatemethod.XiaoCongBanDouFu;

public class Flyweight {
    public void test() {

        System.out.println("===========================");
        System.out.println("Testing Flyweight:");
        System.out.println("===========================");

        Utils.logger.info("(" + this.toString() + ") : " + "Testing Fly Weight");
        Dish dish1 = new XiaoCongBanDouFu();
        Utils.logger.info("(" + this.toString() + ") : " + String.format("%s:%n", dish1.getName()));
        //System.out.format("%s:%n", dish1.getName());
        dish1.showIngredient();
        Dish dish2 = new MaPoToDouFu();
        Utils.logger.info("(" + this.toString() + ") : " + String.format("%s:%n", dish2.getName()));
        //System.out.format("%s:%n", dish2.getName());
        dish2.showIngredient();
    }
}
