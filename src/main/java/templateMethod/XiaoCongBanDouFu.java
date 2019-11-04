package templateMethod;

import FlyWeight.IngredientFactory;
import Utils.Utils;


/**
 * @description: 菜：小葱拌豆腐
 * @author: ldy
 */
public class XiaoCongBanDouFu extends Dish {
    public XiaoCongBanDouFu() {
        ingredients.add(IngredientFactory.getInstance().getIngredient("葱"));
        ingredients.add(IngredientFactory.getInstance().getIngredient("豆腐"));
        ingredients.add(IngredientFactory.getInstance().getIngredient("淀粉"));

    }

    protected void produceEatEffect() {
        Utils.logger.info("(" + this.toString() + ") : " + "食用了小葱拌豆腐，饱食度+20，生命值+5，精神+5\n");
    }

    public String getName() {
        return "小葱拌豆腐";
    }
}
