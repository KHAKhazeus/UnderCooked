/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @className: Flour
 * @packageName: Balking
 * @description: 面粉类，用来展示Balking这一设计模式
 * @data: 2019-11-1
 **/
package balking;
public class Flour  {
    /**
     * 面粉类与Balking相关的属性
     */
    protected FlourState state;

    protected FlourState StirableState;
    protected FlourState StirredState;
    protected FlourState UnStirableState;

    /**
     * @description: 构造函数,创建一个面粉实例
     * @param: null
     */
    public Flour(){
        StirableState=new StirableState(this);
        StirredState=new StirredState(this);
        UnStirableState=new UnStirableState(this);
        this.state= StirableState;
    }

    /**
     * @methodsName: getState
     * @description: 得到面粉目前的状态
     * @param:  null
     * @return: FlourState
     */
    public FlourState getState() {
        return state;
    }

    /**
     * @methodsName: setState
     * @description: 设置面粉目前的状态
     * @param:  FlourState
     * @return: void
     */
    public void setState(FlourState state) {
        this.state = state;
    }

    /**
     * @methodsName: stir
     * @description: 搅拌面粉
     * @param:  null
     * @return: void
     */
    public void stir(){
        this.state.stir();
    }

    /**
     * @methodsName: addEgg
     * @description: 加鸡蛋
     * @param:  null
     * @return: void
     */
    public void addEgg(){this.state.addEgg();}

}

