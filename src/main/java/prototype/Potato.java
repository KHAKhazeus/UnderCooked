package prototype;
/**
 * @title: Potato
 * @package prototype
 * @description: 土豆类。继承自蔬菜类
 * @author: cyy
 * @date: 2019-11-02 23:44
 * @version: V1.0
*/
public class Potato extends Vegetable {
    @Override
    public Vegetable clone() {
        return new Potato(1);
    }

    @Override
    public VegetableType returnType() {
        return VegetableType.Potato;
    }

    @Override
    public void display() {
        logger.info(String.format("(%s): 我是土豆%d号",this.toString(),this.id));
    }

    public Potato() {
        id = -1;
    }

    protected Potato(int i) {
        id = ref++;
    }

    public Integer id;
    static private int ref = 0;
}
