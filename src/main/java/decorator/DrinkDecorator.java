package decorator;

public abstract class DrinkDecorator extends Drink{
    private Drink drink;

    DrinkDecorator(Drink drink){
        this.drink = drink;
    }//向drink加入配料
    @Override
    public String getDescription(){
        return drink.getDescription();
    }//输出配料信息

}
