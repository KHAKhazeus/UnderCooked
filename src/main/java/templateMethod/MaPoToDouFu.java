package templateMethod;

import FlyWeight.IngredientFactory;
import Utils.Utils;

/**
 * @description: 菜：麻婆豆腐
 * @author: ldy
 */
public class MaPoToDouFu extends Dish {
    public MaPoToDouFu() {
        ingredients.add(IngredientFactory.getInstance().getIngredient("辣椒"));
        ingredients.add(IngredientFactory.getInstance().getIngredient("豆腐"));
        ingredients.add(IngredientFactory.getInstance().getIngredient("淀粉"));

    }

    protected void produceEatEffect() {
        Utils.logger.info("(" + this.toString() + ") : " + "食用了麻婆豆腐，饱食度+20，生命值+3，精神+15\n");
    }

    public String getName() {
        return "麻婆豆腐";
    }
}
