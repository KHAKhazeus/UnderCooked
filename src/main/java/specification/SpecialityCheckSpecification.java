package specification;

/**
 * @title: SpecialityCheckSpecification
 * @package specification
 * @description: 继承自Specification类，用于检查厨师擅长方向是否达标
 * @author: cyy
 * @date: 2019-11-03 0:03
 * @version: V1.0
*/
public class SpecialityCheckSpecification extends Specification {

    private SpecialityType speciality;

    public SpecialityCheckSpecification(SpecialityType s) {
        speciality = s;

    }

    @Override
    public boolean isSatisfiedBy(Object params) {
        /**
         *@title: isSatisfiedBy
         *@description: 返回厨师特色是否符合Specification的结果
         *@author: cyy
         *@date: 2019-11-03 1:08
         *@param: [params]
         *@return: boolean
         */

        var cook = (Cook) params;
        return cook.specialities.contains(speciality);
    }

    @Override
    protected String getString() {
        return "厨师特长检查";
    }
}
