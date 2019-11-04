package templateMethod;

import ObjectMother.DishObjectMother;
import Utils.Utils;
import org.junit.jupiter.api.Test;

class TemplateMethod {
    @Test
    void main() {
        Utils.logger.info("(" + this.toString() + ") : " + "Testing Template Method");
        DishObjectMother om = new DishObjectMother();
        Dish dish1 = om.createColdRawRottenTCLJ();
        dish1.eat();
        Dish dish2 = om.createHotOvercookedFreshMPDF();
        dish2.eat();
        return;
    }

}