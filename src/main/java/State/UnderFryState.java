/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @className: UnderFryState
 * @packageName: State
 * @description: 正在煎状态
 * @data: 2019-11-1
 **/
package State;
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
        System.out.println("UnderFrystate:fry:("+this.toString()+"):Frying has been finished and chicken changes into FriedState");
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
        System.out.println("UnderFrystate:cut:("+this.toString()+"):UnderFrystate chicken doesn't need to cut again. It's still in UnderFryState. You can keep frying it.");
    }
}
