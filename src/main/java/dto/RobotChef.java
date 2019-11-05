package dto;

import Utils.Utils;

public class RobotChef {
    //收到预处理处递送的打包好的订单，解开包裹进行料理
    public void receiveFoodPackage(FoodPackage preprocessed){
        Utils.logger.info("(" + this.toString() + ") : " + "Got Package at time: " + preprocessed.getPreprocessedTime()
                .toString() + ", Ordered by: " + preprocessed.getOrderer() + ", including ingredients: \n" +
                preprocessed.ingredientToString());
        Utils.logger.info("(" + this.toString() + ") : " + "Start Cooking!");
    }
}
