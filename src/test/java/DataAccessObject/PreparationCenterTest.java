package DataAccessObject;

import dto.Ingredient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PreparationCenterTest {
    @Test
    void main(){
        //第一批物料
        Ingredient cabage1 = new Ingredient();
        cabage1.name = "cabage 1";
        cabage1.cookingMethod = "boil";
        cabage1.kilogram = 1;
        Ingredient meat1 = new Ingredient();
        meat1.name = "raw meat 1";
        meat1.cookingMethod = "deep fry";
        meat1.kilogram = 2;
        Stock stock = new Stock();
        Porter porter = new Porter(stock);
        PreparationCenter preparationCenter = new PreparationCenter(porter);
        //仓库收到预定
        stock.receiving(cabage1);
        stock.receiving(meat1);
        //预处理处请求获取处理好的物料，已经经由porter搬运且贴上仓库标签，从而可以溯源
        preparationCenter.fetchNextBatch();
        //第二批的物料
        Ingredient cabage2 = new Ingredient();
        cabage2.name = "cabage 2";
        cabage2.cookingMethod = "boil";
        cabage2.kilogram = 1;
        Ingredient meat2 = new Ingredient();
        meat2.name = "raw meat 2";
        meat2.cookingMethod = "deep fry";
        meat2.kilogram = 2;
        stock.receiving(cabage2);
        stock.receiving(meat2);
        preparationCenter.fetchNextBatch();

    }

}