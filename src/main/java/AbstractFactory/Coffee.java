package AbstractFactory;

public class Coffee extends Drink {
    // 咖啡的构造函数
    Coffee(String cupSize){
        this.drinkName = "Coffee";
        this.cupSize = cupSize;
        System.out.println("Producing a " + cupSize + " cup of coffee");
    }
}
