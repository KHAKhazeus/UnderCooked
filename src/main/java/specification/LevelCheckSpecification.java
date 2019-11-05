package specification;

/**
 * @title: LevelCheckSpecification
 * @package specification
 * @description: 继承自Specification类，用于检查厨师等级是否达标
 * @author: cyy
 * @date: 2019-11-03 0:00
 * @version: V1.0
*/
public class LevelCheckSpecification extends Specification {
    private LevelType level;

    public LevelCheckSpecification(LevelType l) {
        level = l;
    }

    @Override
    public boolean isSatisfiedBy(Object params) {
        /**
         *@title: isSatisfiedBy
         *@description: 返回厨师是否满足等级检查的结果
         *@author: cyy
         *@date: 2019-11-03 0:57
         *@param: [params]
         *@return: boolean
         */

        var cook = (Cook) params;
        return cook.level.ordinal() >= level.ordinal();
    }

    @Override
    protected String getString() {
        return "厨师级别检查";
    }
}
