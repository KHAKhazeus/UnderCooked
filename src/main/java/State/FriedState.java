/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @className: FriesState
 * @packageName: State
 * @description: 煎好状态
 * @data: 2019-11-1
 **/
package State;
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
        System.out.println("FriedState:fry:("+this.toString()+"):Frying has been already finished, so chicken changes into OverCookedState");
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
        System.out.println("FriedState:cut:("+this.toString()+"):FriedState chicken doesn't need to cut again. It's still in FriedState.");
    }
}
