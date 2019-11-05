/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @className: UnStirableState
 * @packageName: Balking
 * @description: 不能搅拌状态
 * @data: 2019-11-1
 **/
package balking;
public class UnStirableState implements FlourState {
    /**
     * 哪包面粉与该状态对应
     */
    private Flour flour;

    /**
     * @description: 构造函数,创建一个面粉不可搅拌状态实例
     * @param: Flour
     */
    public UnStirableState(Flour flour){
        this.flour=flour;
    }


    /**
     * @description: 重写getStateName，实现
     * @param: null
     */
    @Override
    public String getStateName() {
        return "UnStirableState";
    }

    /**
     * @methodsName: stir
     * @description: 搅拌面粉
     * @param:  null
     * @return: void
     */
    @Override
    public void stir() {
        System.out.println("UnStirableState:stir:("+this.toString()+"):Stirring is not allowed, because flour is in UnStirableState ");
    }


    /**
     * @methodsName: addEgg
     * @description: 加鸡蛋
     * @param:  null
     * @return: void
     */
    @Override
    public void addEgg() {
        System.out.println("UnStirableState:addEgg:("+this.toString()+"):You can't add eggs because flour is in UnStirableState.");
    }
}
