/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @className: Chicken
 * @packageName: State
 * @description: 鸡肉类，用来展示State这一设计模式
 * @data: 2019-11-1
 **/
package state;
public class Chicken  {
    /**
     * 鸡肉类与State相关的属性
     */
    protected ChickenState state;

    protected ChickenState RawState;
    protected ChickenState CutState;
    protected ChickenState UnderFryState;
    protected ChickenState FriedState;
    protected ChickenState OverCookedState;

    protected boolean isOverCooked;   //这盘鸡肉是否被煮糊


    /**
     * @description: 构造函数,创建一个鸡肉实例
     * @param: null
     */
    public Chicken(){
        RawState=new RawState(this);
        CutState=new CutState(this);
        UnderFryState=new UnderFryState(this);
        FriedState=new FriedState(this);
        OverCookedState=new OverCookedState(this);
        this.state= RawState;

        isOverCooked=false;
    }


    /**
    * @methodsName: isOverCooked
    * @description: 判断鸡肉是否被煮糊
    * @param:  null
    * @return: boolean
    */
    public boolean isOverCooked() {
        return isOverCooked;
    }

    /**
     * @methodsName: SetOverCooked
     * @description: 设置鸡肉是否煮糊了
     * @param:  boolean
     * @return: void
     */
    public void setOverCooked(boolean overCooked) { isOverCooked = overCooked; }


    /**
     * @methodsName: getState
     * @description: 得到鸡肉目前的状态
     * @param:  null
     * @return: ChickenState
     */
    public ChickenState getState() {
        return state;
    }

    /**
     * @methodsName: setState
     * @description: 设置鸡肉目前的状态
     * @param:  ChickenState
     * @return: void
     */
    public void setState(ChickenState state) {
        this.state = state;
    }

    /**
     * @methodsName: fry
     * @description: 煎鸡肉
     * @param:  null
     * @return: void
     */
    public void fry(){
        this.state.fry();
    }

    /**
     * @methodsName: cut
     * @description: 切鸡肉
     * @param:  null
     * @return: void
     */
    public void cut(){this.state.cut();}

}
