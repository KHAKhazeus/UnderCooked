/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @className: RawState
 * @packageName: State
 * @description: 原始状态
 * @data: 2019-11-1
 **/
package state;
public class RawState implements ChickenState {
    /**
     * 哪块鸡肉与该状态对应
     */
    private Chicken chicken;

    /**
     * @description: 构造函数,创建一个鸡肉原始状态实例
     * @param: Chicken
     */
    public RawState(Chicken chicken){
        this.chicken=chicken;
    }

    /**
     * @description: 重写getStateName，实现
     * @param: null
     */
    @Override
    public String getStateName() {
        return "RawState";
    }


    /**
     * @methodsName: cut
     * @description: 切鸡肉
     * @param:  null
     * @return: void
     */
    @Override
    public void cut() {
        System.out.println("RawState: cut: ("+this.toString()+"): 鸡肉开始被切，并且鸡肉状态变为CutState(切好)状态");
        chicken.setState(chicken.CutState);
    }

    /**
     * @methodsName: fry
     * @description: 煎鸡肉
     * @param:  null
     * @return: void
     */
    @Override
    public void fry() {
            System.out.println("RawState: fry: ("+this.toString()+"): 没切的鸡肉不能直接煎. 鸡肉仍处于RawState(原始)状态.");
    }
}
