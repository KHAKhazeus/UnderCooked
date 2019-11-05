package dataaccessobject;

import Utils.Utils;
import dto.Ingredient;

import java.util.ArrayList;

//准备中心，通过搬运工来对仓库进行拿取操作。
//在此我们暂时忽略准备中心发送需要的物料的交互操作，注重与物料的拿取和仓库的状态变化。
public class PreparationCenter {

    //绑定的搬运工
    Porter porter = null;
    public PreparationCenter(Porter newPorter){
        porter = newPorter;
    }

    //将拿到的食材进行统一处理
    private String ingredientToString(ArrayList<Ingredient> ingredients) {
        StringBuilder builder = new StringBuilder();
        for (Ingredient ingredient: ingredients){
            builder.append("食材名: ").append(ingredient.name).append("; 重量: ").append(ingredient.kilogram)
                    .append(" 千克; ").append("加工方法: ").append(ingredient.cookingMethod).append("\n");
        }
        return builder.toString();
    }

    //拿取之前预定的物料
    void fetchNextBatch(){
        ArrayList<Ingredient> result = porter.getIngredients();
        Utils.logger.info("(" + this.toString() + ") : " + "获得食材: " + ingredientToString(result));
        porter.clearStock();
    }
}
