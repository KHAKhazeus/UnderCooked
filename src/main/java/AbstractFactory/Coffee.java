package AbstractFactory;

// 咖啡的构造函数
public class Coffee extends Drink {
    Coffee(String cupSize){
        this.drinkName = "Coffee";
        this.cupSize = cupSize;
        System.out.println("Coffee:Coffee(" + this.toString() + "):Producing a " + cupSize + " cup of coffee");
    }
}
