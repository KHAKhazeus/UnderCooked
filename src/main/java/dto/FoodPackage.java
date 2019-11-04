package dto;

import Utils.Utils;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;


/*
    Data Transfer Object
 */
public class FoodPackage {
    private ArrayList<Ingredient> ingredients = new ArrayList<>();
    private String orderedBy;
    private Timestamp preprocessedTime;

    public String ingredientToString() {
        StringBuilder builder = new StringBuilder();
        for (Ingredient ingredient: ingredients){
            builder.append("Ingredient Name: ").append(ingredient.name).append("; Weight: ").append(ingredient.kilogram)
                .append(" kg; ").append("preferredMethod: ").append(ingredient.cookingMethod).append("\n");
        }
        return builder.toString();
    }

    void pushIngredient(Ingredient next){
        ingredients.add(next);
    }

    ArrayList<Ingredient> getIngredients(){
        return ingredients;
    }

    Ingredient getIngredient(int index){
        if (index >= 0 && index < ingredients.size()){
            return ingredients.get(index);
        }
        else{
            Utils.logger.error("(" + this.toString() + ") : " + "Attempting to get a non-existing ingredient!");
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
