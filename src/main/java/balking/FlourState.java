/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @interfaceName: FlourState
 * @packageName: Balking
 * @description: 面粉状态接口，用来实现不同状态下面粉的不同行为
 * @data: 2019-11-1
 **/
package balking;
public interface FlourState {
    /**
     * @methodsName: getStateName
     * @description: 得到状态名
     * @param:  null
     * @return: String
     */
    public String getStateName();

    /**
     * @methodsName: stir
     * @description: 搅拌面粉
     * @param:  null
     * @return: void
     */
    public void stir();

    /**
     * @methodsName: addEgg
     * @description: 加鸡蛋
     * @param:  null
     * @return: void
     */
    public void addEgg();
}