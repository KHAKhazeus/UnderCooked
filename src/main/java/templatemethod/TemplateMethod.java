package templatemethod;

import Utils.Utils;
import objectmother.DishObjectMother;

public class TemplateMethod {
    public void test() {

        System.out.println("===========================");
        System.out.println("Testing TemplateMethod:");
        System.out.println("===========================");

//        Utils.logger.info("(" + this.toString() + ") : " + "Testing Template Method");
        DishObjectMother om = new DishObjectMother();
        Dish dish1 = om.createColdRawRottenTCLJ();
        dish1.eat();
        Dish dish2 = om.createHotOvercookedFreshMPDF();
        dish2.eat();
        return;
    }
}
