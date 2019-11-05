package abstractfactory;

//  果汁类，继承自饮料类
public class Juice extends Drink {
    Juice(String cupSize){
        this.drinkName = "Juice";
        this.cupSize = cupSize;
        System.out.println("Juice: Juice(" + this.toString() + "):生产了一份" + cupSize + "果汁");
    }
}
