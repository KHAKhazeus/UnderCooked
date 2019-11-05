/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @className: OverCookedState
 * @packageName: State
 * @description: 煎糊状态
 * @data: 2019-11-1
 **/
package state;
public class OverCookedState implements ChickenState {
    /**
     * 哪块鸡肉与该状态对应
     */
    private Chicken chicken;

    /**
     * @description: 构造函数,创建一个鸡肉煎糊状态实例
     * @param: Chicken
     */
    public OverCookedState(Chicken chicken){
        this.chicken=chicken;
    }

    /**
     * @description: 重写getStateName，实现
     * @param: null
     */
    @Override
    public String getStateName() {
        return "OverCoookedState";
    }

    /**
     * @methodsName: fry
     * @description: 煎鸡肉
     * @param:  null
     * @return: void
     */
    @Override
    public void fry() {
        System.out.println("OverCookedState: fry: ("+this.toString()+"): 鸡肉已经被煎糊了, 你可以丢掉了.");
    }

    /**
     * @methodsName: cut
     * @description: 切鸡肉
     * @param:  null
     * @return: void
     */
    @Override
    public void cut() {
        System.out.println("OverCookedState: cut: ("+this.toString()+"): 鸡肉已经被煮糊了, 你可以丢掉了.");
    }
}

