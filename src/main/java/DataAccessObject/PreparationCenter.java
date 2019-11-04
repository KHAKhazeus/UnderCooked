package DataAccessObject;

import Utils.Utils;
import dto.Ingredient;

import java.util.ArrayList;

public class PreparationCenter {

    Porter porter = null;
    public PreparationCenter(Porter newPorter){
        porter = newPorter;
    }

    private String ingredientToString(ArrayList<Ingredient> ingredients) {
        StringBuilder builder = new StringBuilder();
        for (Ingredient ingredient: ingredients){
            builder.append("Ingredient Name: ").append(ingredient.name).append("; Weight: ").append(ingredient.kilogram)
                    .append(" kg; ").append("preferredMethod: ").append(ingredient.cookingMethod).append("\n");
        }
        return builder.toString();
    }

    void fetchNextBatch(){
        ArrayList<Ingredient> result = porter.getIngredients();
        Utils.logger.info("(" + this.toString() + ") : " + "Getting Ingredients: " + ingredientToString(result));
        porter.clearStock();
    }
}
