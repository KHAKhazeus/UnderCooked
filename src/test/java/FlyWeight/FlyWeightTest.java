package FlyWeight;

import Utils.Utils;
import org.junit.jupiter.api.Test;
import templateMethod.Dish;
import templateMethod.MaPoToDouFu;
import templateMethod.XiaoCongBanDouFu;

class FlyWeightTest {

    @Test
    void main() {
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