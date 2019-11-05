/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @className: Stirablestate
 * @packageName: Balking
 * @description: 可搅拌状态
 * @data: 2019-11-1
 **/
package balking;
public class StirableState implements FlourState {
    /**
     * 哪包面粉与该状态对应
     */
    private Flour flour;

    /**
     * @description: 构造函数,创建一个面粉可搅拌状态实例
     * @param: Flour
     */
    public StirableState(Flour flour){
        this.flour=flour;
    }


    /**
     * @description: 重写getStateName，实现
     * @param: null
     */
    @Override
    public String getStateName() {
        return "StirableState";
    }

    /**
     * @methodsName: stir
     * @description: 搅拌面粉
     * @param:  null
     * @return: void
     */
    @Override
    public void stir() {
        System.out.println("StirableState: stir: ("+this.toString()+"): 面粉开始搅拌");
        flour.setState(flour.StirredState);
    }


    /**
     * @methodsName: addEgg
     * @description: 加鸡蛋
     * @param:  null
     * @return: void
     */
    @Override
    public void addEgg() {
        System.out.println("StirableState: addEgg: ("+this.toString()+"): 面粉还没开始搅拌的时候，不能加鸡蛋.");
    }
}
