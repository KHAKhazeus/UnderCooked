package compositeentity;

import Utils.Utils;

public class Client {
    //创建组合实体dish
    private Dish dish;

    public Client() {
        dish = new Dish();
    }

    public void printName() {
        int count = 0;
        String meat = null, vegetable = null;
        for (String name : dish.getDish()) {
            if (count++ == 0) {
                meat = name;
            } else {
                vegetable = name;
            }
        }
        if (meat == "牛肉") {
            if(vegetable=="番茄"){
                Utils.logger.info("(" + this.toString() + ") : " + "茄汁牛肉");
            }else if(vegetable=="土豆"){
                Utils.logger.info("(" + this.toString() + ") : " + "土豆烧牛肉");
            }
        }else if (meat=="鸡肉"){
            if(vegetable=="番茄"){
                Utils.logger.info("(" + this.toString() + ") : " + "鸡肉沙拉");
            }else if(vegetable=="土豆"){
                Utils.logger.info("(" + this.toString() + ") : " + "土豆鸡块");
            }
        }

    }

    public void setName(String meat, String vegetavle) {
        dish.setDish(meat, vegetavle);
    }

}
