package specification;

/**
 * @title: AndSpecification
 * @package specification
 * @description: 继承自Specification类，用于Specification类的and运算
 * @author: cyy
 * @date: 2019-11-02 23:56
 * @version: V1.0
*/
public class AndSpecification extends Specification {
    public Specification a;
    public Specification b;

    AndSpecification(Specification s1, Specification s2) {
        a = s1;
        b = s2;

    }

    @Override
    public boolean isSatisfiedBy(Object params) {
        /**
         *@title: isSatisfiedBy
         *@description: 返回两个Specification进行and运输的结果
         *@author: cyy
         *@date: 2019-11-03 0:52
         *@param: [params]
         *@return: boolean
         */

        return a.isSatisfiedBy(params) && b.isSatisfiedBy(params);
    }

    @Override
    protected String getString() {
        return "(" + a.getString() + " and " + b.getString() + ")";
    }
}
