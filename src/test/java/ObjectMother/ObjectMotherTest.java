package ObjectMother;

import Utils.Utils;
import org.junit.jupiter.api.Test;
import templateMethod.Dish;

class ObjectMotherTest {
    @Test
    void main() {
        Utils.logger.info("(" + this.toString() + ") : " + "Testing ObjectMother");
        DishObjectMother om = new DishObjectMother();
        Dish dish1 = om.createColdRawRottenTCLJ();
        Dish dish2 = om.createHotOvercookedFreshMPDF();
        dish1.printFullInfo();
        dish2.printFullInfo();
    }

}