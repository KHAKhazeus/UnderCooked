/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @className: CutState
 * @packageName: State
 * @description: 切碎状态
 * @data: 2019-11-1
 **/
package State;
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
        System.out.println("CutState:fry:("+this.toString()+"):Chicken has been under fried and changed into UnderFryState");
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
        System.out.println("CutState:cut:("+this.toString()+"):CutState chicken doesn't need to be cut again. It's still in CutState. You can fry it.");
    }
}
