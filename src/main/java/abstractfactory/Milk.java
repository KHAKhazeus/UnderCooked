package abstractfactory;

//  牛奶类，继承自饮料类
public class Milk extends Drink {
    Milk(String cupSize){
        this.drinkName = "Milk";
        this.cupSize = cupSize;
        System.out.println("Milk: Milk(" + this.toString() + "):生产了一份" + cupSize + "牛奶");
    }
}
