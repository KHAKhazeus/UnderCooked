package DataAccessObject;

import Utils.Utils;
import dto.Ingredient;
import java.util.ArrayList;

public class Porter {
    private Stock stock = null;
    public Porter(Stock newStock){
        stock = newStock;
    }

    public ArrayList<Ingredient> getIngredients(){
        ArrayList<Ingredient> result = stock.getAllIngredients();
        return result;
    }

    public void clearStock(){
        stock.stock.clear();
    }
}
