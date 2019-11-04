package DataAccessObject;

import dto.Ingredient;

import java.util.ArrayList;

public class Stock {

    ArrayList<Ingredient> stock = new ArrayList<>();

    public ArrayList<Ingredient> getAllIngredients(){
        return stock;
    }

    private void addingTag(Ingredient newIngredient){
        newIngredient.name += " Tagged by " + this.toString();
    }

    public void receiving(Ingredient newIngredient){
        addingTag(newIngredient);
        stock.add(newIngredient);
    }
}
