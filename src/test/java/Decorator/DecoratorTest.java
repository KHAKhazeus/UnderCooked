package Decorator;

import org.junit.jupiter.api.Test;

class DecoratorTest {
    @Test
    void main(){
        System.out.println();
        System.out.println("Testing Decorator");

        Drink drink = new HouseBlend();//创建一个Houseblen饮料
        System.out.println("Decorator.Drink:getDescription("+this.toString()+") :"+drink.getDescription());//输出drink信息

        drink= new Mocha(drink);//向drink加入mocha
        System.out.println("Decorator.Drink:getDescription("+this.toString()+") :"+drink.getDescription());//输出现在drink的信息

        drink = new Chocolate(drink);//向drink再加入chocolate
        System.out.println("Decorator.Drink:getDescription("+this.toString()+") :"+drink.getDescription());//输出现在的drink信息

        Drink milk = new Milk();//创建一个milk饮料
        milk = new Mocha(milk);//向milk加入mocha
        System.out.println("Decorator.Drink:getDescription("+this.toString()+") :"+milk.getDescription());//输出现在的milk信息
    }

}