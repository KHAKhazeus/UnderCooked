package dataaccessobject;

import dto.Ingredient;

import java.util.ArrayList;

public class Stock {

    //缓冲区
    ArrayList<Ingredient> stock = new ArrayList<>();

    //拿取缓冲区中的所有物料
    public ArrayList<Ingredient> getAllIngredients(){
        return stock;
    }

    //给物料加上仓库标签，表明物料来源
    private void addingTag(Ingredient newIngredient){
        newIngredient.name += " 标签： " + this.toString();
    }

    //收到新的物料请求，贴上标签之后加入缓冲区，等待拿取
    public void receiving(Ingredient newIngredient){
        addingTag(newIngredient);
        stock.add(newIngredient);
    }
}
