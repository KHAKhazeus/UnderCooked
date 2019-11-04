package decorator;

public class DecoratorTest {
    public static void main(String args[]){
        Drink drink = new HouseBlend();//创建一个Houseblen饮料
        System.out.println(drink.getDescription());//输出drink信息

        drink= new Mocha(drink);//向drink加入mocha
        System.out.println(drink.getDescription());//输出现在drink的信息

        drink = new Chocolate(drink);//向drink再加入chocolate
        System.out.println(drink.getDescription());//输出现在的drink信息

        Drink milk = new Milk();//创建一个milk饮料
        milk = new Mocha(milk);//向milk加入mocha
        System.out.println(milk.getDescription());//输出现在的milk信息
    }
}
