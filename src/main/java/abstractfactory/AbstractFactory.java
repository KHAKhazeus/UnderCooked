package abstractfactory;

// 饮料的抽象工厂
public interface AbstractFactory {
    public abstract Drink getMilk(String cupSize);
    public abstract Drink getCoffee(String cupSize);
    public abstract Drink getJuice(String cupSize);
}