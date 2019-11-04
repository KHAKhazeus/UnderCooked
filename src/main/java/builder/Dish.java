package builder;


import Utils.Utils;
import com.google.common.base.Joiner;


import javax.swing.*;
import java.security.PublicKey;
import java.util.ArrayList;

/**
 * 一道菜，不是盘子
 */
public class Dish {
    private final String name;
    private ArrayList<Ingredient> ingredients;
    private ArrayList<Seasoning> seasonings;
    private CookingMethodEnum cookingMethod;
    private Double cookingTimeMinutes;

    private Dish(Builder builder) {
        this.name = builder.name;
        this.ingredients = builder.ingredients;
        this.seasonings = builder.seasonings;
        this.cookingMethod = builder.cookingMethod;
        this.cookingTimeMinutes = builder.cookingTimeMinutes;
    }

    public void showInfo() {
        String prefix = String.format("(%s) : ", this.toString());
        var ingredientsString = new ArrayList<String>();
        for (Ingredient ingredient : this.ingredients) {
            ingredientsString.add(String.format("%s %d克", ingredient.name, ingredient.weightGram));
        }

        var seasoningString = new ArrayList<String>();
        for (Seasoning seasoning : this.seasonings) {
            seasoningString.add(String.format("%s %d克", seasoning.name, seasoning.weightGram));
        }

        String ingredients = Joiner.on("、").join(ingredientsString);
        String seasonings = Joiner.on("、").join(seasoningString);

        Utils.logger.info(prefix + String.format("菜名：%s", this.name));
        Utils.logger.info(prefix + String.format("食材：%s", ingredients));
        Utils.logger.info(prefix + String.format("调料：%s", seasonings));
        Utils.logger.info(prefix + String.format("烹饪方法：%s %.1f分钟", this.cookingMethod.getChineseName(), this.cookingTimeMinutes));
    }

    public static class Builder {
        private final String name;
        private ArrayList<Ingredient> ingredients;
        private ArrayList<Seasoning> seasonings;
        private CookingMethodEnum cookingMethod;
        private Double cookingTimeMinutes;

        public Builder(String name) {
            this.name = name;
            this.ingredients = new ArrayList<Ingredient>();
            this.seasonings = new ArrayList<Seasoning>();
        }

        public Builder addIngredient(Ingredient ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Builder addSeasoning(Seasoning seasoning) {
            this.seasonings.add(seasoning);
            return this;
        }

        public Builder setCookingMethod(CookingMethodEnum cookingMethod) {
            this.cookingMethod = cookingMethod;
            return this;
        }

        public Builder setCookingTime(Double cookingTimeMinutes) {
            this.cookingTimeMinutes = cookingTimeMinutes;
            return this;
        }

        public Dish cook() {
            return new Dish(this);
        }
    }

}