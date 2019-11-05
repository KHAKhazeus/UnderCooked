package prototype;
/**
 * @title: Tomato
 * @package prototype
 * @description: 番茄类，继承自蔬菜类
 * @author: cyy
 * @date: 2019-11-02 23:45
 * @version: V1.0
*/
public class Tomato extends Vegetable {
    @Override
    public Vegetable clone() {
        return new Tomato(1);
    }

    @Override
    public VegetableType returnType() {
        return VegetableType.Tomato;
    }

    @Override
    public void display() {
        logger.info(String.format("(%s): 我是番茄%d号",this.toString(),this.id));
    }

    protected Tomato(int i) {
        id = ref++;
    }

    public Tomato() {
        id = -1;
    }

    public Integer id;
    static private int ref = 0;
}
