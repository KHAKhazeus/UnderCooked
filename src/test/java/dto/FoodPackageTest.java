package dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodPackageTest {
    @Test
    void main(){
        //新的物料
        Ingredient cabage = new Ingredient();
        cabage.name = "cabage";
        cabage.cookingMethod = "boil";
        cabage.kilogram = 1;
        Ingredient meat = new Ingredient();
        meat.name = "raw meat";
        meat.cookingMethod = "deep fry";
        meat.kilogram = 2;
        Preprocessing preprocessingLine = new Preprocessing();
        RobotChef chef = new RobotChef();
        preprocessingLine.establishPipe(chef);
        //预处理之后再递送到厨师手上
        preprocessingLine.preprocess("FoodKing", cabage, meat);
    }

}