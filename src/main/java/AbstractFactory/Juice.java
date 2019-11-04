package AbstractFactory;

//  果汁类，继承自饮料类
public class Juice extends Drink {
    Juice(String cupSize){
        this.drinkName = "Juice";
        this.cupSize = cupSize;
        System.out.println("Producing a " + cupSize + " cup of juice");
    }
}
