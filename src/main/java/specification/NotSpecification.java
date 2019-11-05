package specification;

/**
 * @title: NotSpecification
 * @package specification
 * @description: 继承自Specification类，用于Specification类的not运算
 * @author: cyy
 * @date: 2019-11-03 0:01
 * @version: V1.0
*/
public class NotSpecification extends Specification {
    public Specification a;

    NotSpecification(Specification s) {
        a = s;
    }

    @Override
    public boolean isSatisfiedBy(Object params) {
        /**
         *@title: isSatisfiedBy
         *@description: 返回Specification进行not运算的结果
         *@author: cyy
         *@date: 2019-11-03 0:58
         *@param: [params]
         *@return: boolean
         */

        return !a.isSatisfiedBy(params);
    }

    @Override
    protected String getString() {
        return "( not " + a.getString() + ")";
    }
}
