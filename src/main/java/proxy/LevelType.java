package proxy;

/**
 * @title: LevelType
 * @package proxy
 * @description: 枚举类，表示厨师的等级
 * @author: cyy
 * @date: 2019-11-02 23:53
 * @version: V1.0
*/
public enum LevelType {
    Primary("初级"), Medium("中级"), High("高级");
    private String name;
    private LevelType(String s){
        name=s;
    }
    public String getName(){
        /**
         *@title: getName
         *@description: 枚举项与字符串转换
         *@author: cyy
         *@date: 2019-11-03 0:29
         *@param: []
         *@return: java.lang.String
         */

        return name;
    }
}
