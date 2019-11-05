package abstractfactory;

public class Coffee extends Drink {
    // 咖啡的构造函数
    Coffee(String cupSize){
        this.drinkName = "Coffee";
        this.cupSize = cupSize;
        System.out.println("Coffee: Coffee(" + this.toString() + "):生产了一份" + cupSize + "咖啡");
    }
}
