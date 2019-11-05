package DataAccessObject;

import Utils.Utils;
import dto.Ingredient;
import java.util.ArrayList;

//搬运工：对仓库进行统一的管理（增删改查）
public class Porter {
    private Stock stock = null;
    //分配搬运的仓库对象
    public Porter(Stock newStock){
        stock = newStock;
    }
    //从仓库中取出准备好的物料
    public ArrayList<Ingredient> getIngredients(){
        ArrayList<Ingredient> result = stock.getAllIngredients();
        return result;
    }
    //清空仓库中准备好的并且也已经取出的物料
    public void clearStock(){
        stock.stock.clear();
    }
}
