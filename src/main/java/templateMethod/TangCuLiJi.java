package templateMethod;

import FlyWeight.IngredientFactory;
import Utils.Utils;

/**
 * @description: 菜：糖醋里脊
 * @author: ldy
 */
public class TangCuLiJi extends Dish {
    public TangCuLiJi() {
        ingredients.add(IngredientFactory.getInstance().getIngredient("糖"));
        ingredients.add(IngredientFactory.getInstance().getIngredient("醋"));
        ingredients.add(IngredientFactory.getInstance().getIngredient("里脊"));
    }

    protected void produceEatEffect() {
        Utils.logger.info("(" + this.toString() + ") : " + "食用了糖醋里脊，饱食度+30，生命值+10，精神-2\n");
    }

    public String getName() {
        return "糖醋里脊";
    }
}
