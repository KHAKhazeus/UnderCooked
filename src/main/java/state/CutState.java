/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @className: CutState
 * @packageName: State
 * @description: 切碎状态
 * @data: 2019-11-1
 **/
package state;
public class CutState implements ChickenState {
    /**
     * 哪块鸡肉与该状态对应
     */
    private Chicken chicken;

    /**
     * @description: 构造函数,创建一个鸡肉切碎状态实例
     * @param: Chicken
     */
    public CutState(Chicken chicken){
        this.chicken=chicken;
    }


    /**
     * @description: 重写getStateName，实现
     * @param: null
     */
    @Override
    public String getStateName() {
        return "CutState";
    }

    /**
     * @methodsName: fry
     * @description: 煎鸡肉
     * @param:  null
     * @return: void
     */
    @Override
    public void fry() {
        System.out.println("CutState: fry: ("+this.toString()+"): 开始煎鸡肉，鸡肉的状态变为UnderFryState(正在煎状态)");
        chicken.setState(chicken.UnderFryState);
    }


    /**
     * @methodsName: cut
     * @description: 切鸡肉
     * @param:  null
     * @return: void
     */
    @Override
    public void cut() {
        System.out.println("CutState: cut: ("+this.toString()+"): 切好的鸡肉不需要再切了. 鸡肉仍处于CutState(切碎状态). 你可以煎它.");
    }
}
