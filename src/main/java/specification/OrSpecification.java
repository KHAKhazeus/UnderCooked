package specification;

/**
 * @title: OrSpecification
 * @package specification
 * @description: 继承自Specification类，用于Specification类的or运算
 * @author: cyy
 * @date: 2019-11-03 0:01
 * @version: V1.0
*/
public class OrSpecification extends Specification {
    public Specification a;
    public Specification b;

    public OrSpecification(Specification s1, Specification s2) {
        a = s1;
        b = s2;

    }

    @Override
    public boolean isSatisfiedBy(Object params) {
        /**
         *@title: isSatisfiedBy
         *@description: 返回两个Specification进行or运算的结果
         *@author: cyy
         *@date: 2019-11-03 1:00
         *@param: [params]
         *@return: boolean
         */

        return a.isSatisfiedBy(params) || b.isSatisfiedBy(params);
    }

    @Override
    protected String getString() {
        return "(" + a.getString() + " or " + b.getString() + ")";
    }
}
