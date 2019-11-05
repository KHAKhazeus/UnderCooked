package specification;

/**
 * @title: StatusCheckSpecification
 * @package specification
 * @description: 继承自Specification类，用于检查厨师是否处于空闲状态
 * @author: cyy
 * @date: 2019-11-02 23:58
 * @version: V1.0
*/
public class StatusCheckSpecification extends Specification {
    @Override
    public boolean isSatisfiedBy(Object params) {
        /**
         *@title: isSatisfiedBy
         *@description: 返回厨师状态是否处于空闲的结果
         *@author: cyy
         *@date: 2019-11-03 1:09
         *@param: [params]
         *@return: boolean
         */

        var cook = (Cook) params;
        return !cook.isBusy;
    }

    public StatusCheckSpecification() {
        super();
    }

    @Override
    protected String getString() {
        return "厨师状态检查";
    }
}
