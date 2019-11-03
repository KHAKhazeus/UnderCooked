package prototype;
/**   
 * @title: Basket
 * @package prototype
 * @description: 菜篮类， 相当于Vegetable类的原型管理器
 * @author: cyy
 * @date: 2019-11-02 23:42
 * @version: V1.0   
*/
public class Basket {
    static private Basket instance = null;
    static private int nextSlot = 0;
    private Vegetable vegetables[];

    public static Basket getInstance() {
        /**  
         *@title: getInstance
         *@description: 采用Singleton设计模式，获取一个Basket实例
         *@author: cyy  
         *@date: 2019-11-03 0:11   
         *@param: []
         *@return: prototype.Basket
         */   
        
        if (instance == null) {
            instance = new Basket();
        }
        return instance;
    }

    //构造函数，不可被直接调用
    private Basket() {
        vegetables = new Vegetable[5];
        vegetables[nextSlot++] = new Tomato();
        vegetables[nextSlot++] = new Potato();
        vegetables[nextSlot++] = new Spinach();
    }

    public void addPrototype(Vegetable v) {
        /**
         *@title: addPrototype
         *@description: 向Basket中增加一个原型实例
         *@author: cyy
         *@date: 2019-11-03 0:12
         *@param: [v]
         *@return: void
         */

        if (nextSlot >= 5) {
            System.out.println("以达到植物种类上限");
            return;
        }
        vegetables[nextSlot++] = v;
    }

    public Vegetable findAndClone(VegetableType type) {
        /**
         *@title: findAndClone
         *@description: 找到与type类型相同的原型实例，并返回一个克隆对象，如果未找到，则返回null
         *@author: cyy
         *@date: 2019-11-03 0:13
         *@param: [type]
         *@return: prototype.Vegetable
         */

        for (var vegetable : vegetables) {
            if (vegetable.returnType() == type) {
                return vegetable.clone();
            }
        }
        return null;
    }
}
