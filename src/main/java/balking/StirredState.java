/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @className: StirredState
 * @packageName: Balking
 * @description: 搅拌完成状态
 * @data: 2019-11-1
 **/
package balking;
public class StirredState implements FlourState {
    /**
     * 哪包面粉与该状态对应
     */
    private Flour flour;

    /**
     * @description: 构造函数,创建一个面粉搅拌完成状态实例
     * @param: Flour
     */
    public StirredState(Flour flour){
        this.flour=flour;
    }


    /**
     * @description: 重写getStateName，实现
     * @param: null
     */
    @Override
    public String getStateName() {
        return "StirredState";
    }

    /**
     * @methodsName: stir
     * @description: 搅拌面粉
     * @param:  null
     * @return: void
     */
    @Override
    public void stir() {
        System.out.println("StirredState:stir: ("+this.toString()+"): 面粉已经搅拌好了，不需要再搅拌");
        flour.setState(flour.UnStirableState);
    }


    /**
     * @methodsName: addEgg
     * @description: 加鸡蛋
     * @param:  null
     * @return: void
     */
    @Override
    public void addEgg() {
        System.out.println("StirredState: addEgg: ("+this.toString()+"): 搅拌好的面粉里加入了一个鸡蛋");
    }
}
