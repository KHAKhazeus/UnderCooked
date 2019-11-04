package ObjectMother;

import templateMethod.*;

/**
 * @description: Dish类的Object Mother,使用了ObjectMother设计模式，用来在测试时方便得产生测试样品
 * @author: ldy
 */
public class DishObjectMother {
    public MaPoToDouFu createHotOvercookedFreshMPDF() {
        MaPoToDouFu dish = new MaPoToDouFu();
        dish.setFreshness(Freshness.FRESH);
        dish.setQuality(Quality.OVERCOOKED);
        dish.setTemperature(Temprature.HOT);
        return dish;
    }

    public TangCuLiJi createColdRawRottenTCLJ() {
        TangCuLiJi dish = new TangCuLiJi();
        dish.setFreshness(Freshness.ROTTEN);
        dish.setQuality(Quality.RAW);
        dish.setTemperature(Temprature.COLD);
        return dish;
    }
}
