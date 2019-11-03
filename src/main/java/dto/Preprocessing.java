package dto;

import Utils.Utils;
import java.sql.Timestamp;

public class Preprocessing {

    private RobotChef chef;

    void establishPipe(RobotChef newChef){
        chef = newChef;
    }

    void preprocess(String orderedBy, Ingredient... ingredients){
        //making package
        Utils.logger.info("(" + this.toString() + ") : " + "Got order from: " + orderedBy);
        Utils.logger.info("(" + this.toString() + ") : " + "Start Packaging and Preprocessing");
        FoodPackage pack = new FoodPackage();
        pack.setOrderer(orderedBy);
        for (Ingredient ingredient: ingredients){
            pack.pushIngredient(ingredient);
        }
        Utils.logger.info("(" + this.toString() + ") : " + "get ingredients: \n" + pack.ingredientToString());
        //add timestamp
        pack.setPreprocessedTime(new Timestamp(System.currentTimeMillis()));
        sendPackage(chef, pack);
    }

    private void sendPackage(RobotChef chef, FoodPackage pack){
        chef.receiveFoodPackage(pack);
    }
}
