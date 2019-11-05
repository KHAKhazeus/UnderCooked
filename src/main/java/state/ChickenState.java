/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @interfaceName: ChickenState
 * @packageName: State
 * @description: 鸡肉状态接口，用来实现不同状态下鸡肉的不同行为
 * @data: 2019-11-1
 **/
package state;
public interface ChickenState {
    /**
     * @methodsName: getStateName
     * @description: 得到状态名
     * @param:  null
     * @return: String
     */
    public String getStateName();

    /**
     * @methodsName: cut
     * @description: 切鸡肉
     * @param:  null
     * @return: void
     */
    public void cut();

    /**
     * @methodsName: fry
     * @description: 煎鸡肉
     * @param:  null
     * @return: void
     */
    public void fry();
}