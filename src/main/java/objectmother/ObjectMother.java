package objectmother;

import Utils.Utils;
import templatemethod.Dish;

public class ObjectMother {
    public void test() {

        System.out.println("===========================");
        System.out.println("Testing ObjectMother:");
        System.out.println("===========================");

//        Utils.logger.info("(" + this.toString() + ") : " + "Testing ObjectMother");
        DishObjectMother om = new DishObjectMother();
        Dish dish1 = om.createColdRawRottenTCLJ();
        Dish dish2 = om.createHotOvercookedFreshMPDF();
        dish1.printFullInfo();
        dish2.printFullInfo();
    }
}
