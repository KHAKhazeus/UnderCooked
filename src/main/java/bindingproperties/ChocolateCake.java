/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @className: ChocolateCake
 * @packageName: BindingProperties
 * @description: 巧克力蛋糕类，用来展示BindingProperties这一设计模式
 * @data: 2019-11-1
 **/
package bindingproperties;
import javafx.beans.property.SimpleIntegerProperty;

public class ChocolateCake {
    /**
     * 巧克力蛋糕类与BindingProperties相关的属性
     */
    protected SimpleIntegerProperty income;   //巧克力蛋糕此刻的收益
    protected String name;
    protected SimpleIntegerProperty inOrder; //做好的这道巧克力蛋糕是否在订单栏里

    /**
     * @description: 构造函数,创建一个巧克力蛋糕实例
     * @param: boolean
     */
    public ChocolateCake(boolean inorder){
        this.name = "ChocolateCake";
        if(inorder) {
            inOrder = new SimpleIntegerProperty(1);
        }
        else{
            inOrder = new SimpleIntegerProperty(0);
        }
        income = new SimpleIntegerProperty();
        income.bind(inOrder.multiply(48)); //属性绑定，蛋糕在订单栏里收益就是48，不在就是0
        income.get();
    }

    /**
     * @methodsName: getIncome
     * @description: 得到蛋糕此刻的收益
     * @param:  null
     * @return: int
     */
    public int getIncome() {
        return this.income.get();
    }


    /**
     * @methodsName: setInOrder
     * @description: 设置此刻蛋糕在不在订单栏中
     * @param:  boolean
     * @return: void
     */
    public void setInOrder(boolean order){
        if(order){
            inOrder.set(1);
        }
        else{
            inOrder.set(0);
        }
    }

}

