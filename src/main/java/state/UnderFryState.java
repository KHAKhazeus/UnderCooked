/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @className: UnderFryState
 * @packageName: State
 * @description: 正在煎状态
 * @data: 2019-11-1
 **/
package state;
public class UnderFryState implements ChickenState {
    /**
     * 哪块鸡肉与该状态对应
     */
    private Chicken chicken;

    /**
     * @description: 构造函数,创建一个鸡肉正在煎状态实例
     * @param: Chicken
     */
    public UnderFryState(Chicken chicken){
        this.chicken=chicken;
    }

    /**
     * @description: 重写getStateName，实现
     * @param: null
     */
    @Override
    public String getStateName() {
        return "UnderFryState";
    }

    /**
     * @methodsName: fry
     * @description: 煎鸡肉
     * @param:  null
     * @return: void
     */
    @Override
    public void fry() {
        System.out.println("UnderFrystate: fry: ("+this.toString()+"): 煎鸡肉的过程结束了，鸡肉状态变为FriedState(煎好)状态");
        chicken.setState(chicken.FriedState);
    }

    /**
     * @methodsName: cut
     * @description: 切鸡肉
     * @param:  null
     * @return: void
     */
    @Override
    public void cut() {
        System.out.println("UnderFrystate: cut: ("+this.toString()+"): 正在煎的鸡肉不能被切. 鸡肉仍处于UnderFryState(在煎)状态. 你可以继续让鸡肉煎着.");
    }
}
