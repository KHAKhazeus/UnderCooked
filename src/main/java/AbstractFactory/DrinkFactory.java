package AbstractFactory;

// 饮料工厂
public class DrinkFactory implements AbstractFactory {
    // 根据杯子大小产生一杯牛奶
    public Drink getMilk(String cupSize){
        return new Milk(cupSize);
    }
    // 根据杯子大小产生一杯咖啡
    public Drink getCoffee(String cupSize){
        return new Coffee(cupSize);
    }
    // 根据杯子大小产生一杯果汁
    public Drink getJuice(String cupSize){
        return new Juice(cupSize);
    }
}
