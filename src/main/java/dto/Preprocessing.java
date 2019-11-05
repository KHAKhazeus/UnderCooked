package dto;

import Utils.Utils;
import java.sql.Timestamp;

//预处理处，有一个固定的机器人厨师，预处理将食材按照要求打包好之后一起送给机器人厨师
public class Preprocessing {

    private RobotChef chef;

    //分配厨师
    void establishPipe(RobotChef newChef){
        chef = newChef;
    }

    //进行处理，所有食材和订单人传入预处理处
    void preprocess(String orderedBy, Ingredient... ingredients){
        //making package
        Utils.logger.info("(" + this.toString() + ") : " + "订单人: " + orderedBy);
        Utils.logger.info("(" + this.toString() + ") : " + "开始打包和预处理");
        FoodPackage pack = new FoodPackage();
        pack.setOrderer(orderedBy);
        for (Ingredient ingredient: ingredients){
            pack.pushIngredient(ingredient);
        }
        Utils.logger.info("(" + this.toString() + ") : " + "得到食材: \n" + pack.ingredientToString());
        //add timestamp
        pack.setPreprocessedTime(new Timestamp(System.currentTimeMillis()));
        sendPackage(chef, pack);
    }
    //递送打包好的对象
    private void sendPackage(RobotChef chef, FoodPackage pack){
        chef.receiveFoodPackage(pack);
    }
}
