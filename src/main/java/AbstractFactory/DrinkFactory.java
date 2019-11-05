package AbstractFactory;

// 饮料工厂
public class DrinkFactory implements AbstractFactory {
    /**
     * @description: 根据杯子大小产生一杯牛奶
     * @param: String
     * @return Drink
     */
    public Drink getMilk(String cupSize){
        return new Milk(cupSize);
    }
    /**
     * @description: 根据杯子大小产生一杯咖啡
     * @param: String
     * @return Drink
     */
    public Drink getCoffee(String cupSize){
        return new Coffee(cupSize);
    }
    /**
     * @description: 根据杯子大小产生一杯果汁
     * @param: String
     * @return Drink
     */
    public Drink getJuice(String cupSize){
        return new Juice(cupSize);
    }
}
