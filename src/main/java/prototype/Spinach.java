package prototype;
/**
 * @title: Spinach
 * @package prototype
 * @description: 菠菜类，继承自蔬菜类
 * @author: cyy
 * @date: 2019-11-02 23:45
 * @version: V1.0
*/
public class Spinach extends Vegetable {
    @Override
    public VegetableType returnType() {
        return VegetableType.Spinach;
    }

    @Override
    public Vegetable clone() {
        return new Spinach(1);
    }

    @Override
    public void display() {
        logger.info(String.format("(%s): 我是菠菜%d号",this.toString(),this.id));
    }

    public Spinach() {
        id = -1;
    }

    protected Spinach(int i) {
        id = ref++;
    }

    public Integer id;
    static private int ref = 0;
}
