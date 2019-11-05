/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @className: FriesState
 * @packageName: State
 * @description: 煎好状态
 * @data: 2019-11-1
 **/
package state;
public class FriedState implements ChickenState {
    /**
     * 哪块鸡肉与该状态对应
     */
    private Chicken chicken;

    /**
     * @description: 构造函数,创建一个鸡肉煎好状态实例
     * @param: Chicken
     */
    public FriedState(Chicken chicken){
        this.chicken=chicken;
    }


    /**
     * @description: 重写getStateName，实现
     * @param: null
     */
    @Override
    public String getStateName() {
        return "FriedState";
    }


    /**
     * @methodsName: fry
     * @description: 煎鸡肉
     * @param:  null
     * @return: void
     */
    @Override
    public void fry() {
        System.out.println("FriedState: fry: ("+this.toString()+"): 鸡肉早就被煎好了, 再煎导致鸡肉的状态变为OverCookedState(煮糊了)状态");
        chicken.setState(chicken.OverCookedState);
        chicken.setOverCooked(true);
    }


    /**
     * @methodsName: cut
     * @description: 切鸡肉
     * @param:  null
     * @return: void
     */
    @Override
    public void cut() {
        System.out.println("FriedState: cut: ("+this.toString()+"): 煎好的鸡肉不需要再切了. 鸡肉仍处于FriedState(煎好)状态.");
    }
}
