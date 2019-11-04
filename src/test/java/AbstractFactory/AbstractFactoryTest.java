package AbstractFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {
    @Test
    void main(){
        System.out.println("AbstractFactory:");
        DrinkFactory drinkFactory = new DrinkFactory();
        drinkFactory.getCoffee("Large");
        drinkFactory.getMilk("Mid");
        drinkFactory.getJuice("Small");
    }
}