package decorator;

public class Chocolate extends DrinkDecorator {
    Chocolate(Drink drink){
        super(drink);
    }//构造巧克力配料，参数为要加入的饮料对象

    @Override
    public String getDescription() {
        return super.getDescription()+" + 巧克力";
    }//输出配料信息
}
