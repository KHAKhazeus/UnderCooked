package dto;

import Utils.Utils;

public class RobotChef {
    public void receiveFoodPackage(FoodPackage preprocessed){
        Utils.logger.info("(" + this.toString() + ") : " + "Got Package at time: " + preprocessed.getPreprocessedTime()
                .toString() + ", Ordered by: " + preprocessed.getOrderer() + ", including ingredients: \n" +
                preprocessed.ingredientToString());
        Utils.logger.info("(" + this.toString() + ") : " + "Start Cooking!");
    }
}
