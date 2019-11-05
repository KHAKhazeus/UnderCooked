package AbstractFactory;

//  牛奶类，继承自饮料类
public class Milk extends Drink {
    Milk(String cupSize){
        this.drinkName = "Milk";
        this.cupSize = cupSize;
        System.out.println("Producing a " + cupSize + " cup of milk");
    }
}
