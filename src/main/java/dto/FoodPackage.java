package dto;

import Utils.Utils;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;


/*
    Data Transfer Object
    打包用的类
 */
public class FoodPackage {
    private ArrayList<Ingredient> ingredients = new ArrayList<>();
    private String orderedBy;
    private Timestamp preprocessedTime;

    //将内部的材料进行格式化输出
    public String ingredientToString() {
        StringBuilder builder = new StringBuilder();
        for (Ingredient ingredient: ingredients){
            builder.append("食材名: ").append(ingredient.name).append("; 重量: ").append(ingredient.kilogram)
                .append(" 千克; ").append("加工方法: ").append(ingredient.cookingMethod).append("\n");
        }
        return builder.toString();
    }

    void pushIngredient(Ingredient next){
        ingredients.add(next);
    }

    ArrayList<Ingredient> getIngredients(){
        return ingredients;
    }

    //获得指定材料
    Ingredient getIngredient(int index){
        if (index >= 0 && index < ingredients.size()){
            return ingredients.get(index);
        }
        else{
            Utils.logger.error("(" + this.toString() + ") : " + "程序尝试获取并不存在的食材!");
            return null;
        }
    }

    void setOrderer(String newOrderedBy){
        orderedBy = newOrderedBy;
    }

    String getOrderer(){
        return orderedBy;
    }

    void setPreprocessedTime(Timestamp time){
        preprocessedTime = time;
    }

    Timestamp getPreprocessedTime(){
        return preprocessedTime;
    }
}
