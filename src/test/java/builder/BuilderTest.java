package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuilderTest {
    @Test
    void main() {
        var dish1 = new Dish.Builder("宫保鸡丁")
                .addIngredient(new Ingredient("鸡脯肉", 225))
                .addIngredient(new Ingredient("花生米", 50))
                .addIngredient(new Ingredient("葱", 45))
                .addIngredient(new Ingredient("姜", 10))
                .addSeasoning(new Seasoning("干辣椒", 8))
                .addSeasoning(new Seasoning("花椒", 1))
                .addSeasoning(new Seasoning("色拉油", 60))
                .addSeasoning(new Seasoning("食盐", 2))
                .setCookingMethod(CookingMethodEnum.STIR_FRY)
                .setCookingTime(5.0)
                .cook();
        dish1.showInfo();
    }
}