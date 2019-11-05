package prototype;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @title: Vegetable
 * @package prototype
 * @description: 蔬菜基类，用于prototype pattern
 * @author: cyy
 * @date: 2019-11-02 23:41
 * @version: V1.0
*/
abstract public class Vegetable {
    public static final Logger logger= LogManager.getLogger();

    public abstract Vegetable clone(
            /**
             *@title: clone
             *@description: 返回一个克隆对象
             *@author: cyy
             *@date: 2019-11-03 0:14
             *@param: []
             *@return: prototype.Vegetable
             */

    );

    public abstract void display(
            /**
             *@title: display
             *@description: 在控制台中显示Vegetable实例的相关信息
             *@author: cyy
             *@date: 2019-11-03 0:15
             *@param: []
             *@return: void
             */

    );

    public abstract VegetableType returnType(
            /**
             *@title: returnType
             *@description: 返回一个Vegetable实例的类型，返回类型为VegetableType
             *@author: cyy
             *@date: 2019-11-03 0:15
             *@param: []
             *@return: prototype.VegetableType
             */

    );
}
