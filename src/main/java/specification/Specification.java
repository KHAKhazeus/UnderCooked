package specification;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @title: Specification
 * @package specification
 * @description: Specification基类
 * @author: cyy
 * @date: 2019-11-03 0:02
 * @version: V1.0
*/
abstract public class Specification {
    public static final Logger logger = LogManager.getLogger();

    public Specification and(Specification other) {
        /**
         *@title: and
         *@description: 将两个Specification进行and运算并返回新的Specification
         *@author: cyy
         *@date: 2019-11-03 0:54
         *@param: [other]
         *@return: specification.Specification
         */

        return new AndSpecification(this, other);
    }

    public Specification or(Specification other) {
        /**
         *@title: or
         *@description: 将两个Specification进行or运算并返回新的Specification
         *@author: cyy
         *@date: 2019-11-03 0:55
         *@param: [other]
         *@return: specification.Specification
         */

        return new OrSpecification(this, other);
    }

    public Specification not() {
        /**
         *@title: not
         *@description: 将Specification进行not运算并返回新的Specification
         *@author: cyy
         *@date: 2019-11-03 0:56
         *@param: []
         *@return: specification.Specification
         */

        return new NotSpecification(this);
    }

    public abstract boolean isSatisfiedBy(Object params
                                          /**
     *@title: isSatisfiedBy
     *@description: 判断传入参数是否符合规约条件
     *@author: cyy
     *@date: 2019-11-03 0:54
     *@param: [params]
     *@return: boolean
     */
    );

    public void choose(Cook[] cooks) {
        /**
         *@title: choose
         *@description: 从列表中对象选择所有符合条件的
         *@author: cyy
         *@date: 2019-11-03 0:53
         *@param: [cooks]
         *@return: void
         */

        for (var cook : cooks) {
            if (this.isSatisfiedBy(cook)) {
                logger.info(String.format("(%s): %s符合所要求的条件", this.toString(), cook.name));
            }
        }
    }

    public void display() {
        /**
         *@title: display
         *@description: 可视化Specification组合构成的条件
         *@author: cyy
         *@date: 2019-11-03 0:56
         *@param: []
         *@return: void
         */

        logger.info(String.format("(%s): 筛选条件: %s", this.toString(), this.getString()));
    }

    abstract protected String getString(/**
     *@title: getString
     *@description: 将规约条件转化为字符串
     *@author: cyy
     *@date: 2019-11-03 0:52
     *@param: []
     *@return: java.lang.String
     */
    );

}
