package proxy;

/**
 * @title: SpecialityType
 * @package proxy
 * @description: 枚举类，表示厨师擅长方向
 * @author: cyy
 * @date: 2019-11-02 23:55
 * @version: V1.0
*/
public enum SpecialityType {
    Shandong("鲁菜"), Sichuan("川菜"), Guangdong("粤菜"), Fujian("闽菜"),
    Jiangsu("苏菜"), Zhejiang("浙菜"), Hunan("湘菜"), Anhui("徽菜");
    private String name;
    SpecialityType(String s){
        name=s;
    }
    public String getName(){
        return name;
    }
    static public String getSpecialities(SpecialityType[] s){
        /**
         *@title: getSpecialities
         *@description: 将厨师特长列表转化为一个数组
         *@author: cyy
         *@date: 2019-11-03 0:43
         *@param: [s]
         *@return: java.lang.String
         */

        String names=new String();
        for (var e :s){
            names+=e.getName()+" ";
        }
        return names;
    }
}
