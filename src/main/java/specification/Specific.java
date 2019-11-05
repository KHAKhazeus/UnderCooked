package specification;

/**
 * @title: SpecificationTest
 * @package specification
 * @description: specification测试类
 * @author: cyy
 * @date: 2019-11-03 0:03
 * @version: V1.0
*/
public class Specific {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing Specification:");
        System.out.println("===========================");

        /**
         * 创建厨师实例
         */
        var cook1 = new Chef("a", false, LevelType.High, new SpecialityType[]{SpecialityType.Guangdong, SpecialityType.Fujian});
        var cook2 = new Chef("b", false, LevelType.Medium, new SpecialityType[]{SpecialityType.Guangdong, SpecialityType.Hunan});
        var cook3 = new Chef("c", true, LevelType.Medium, new SpecialityType[]{SpecialityType.Jiangsu, SpecialityType.Anhui});

        /**
         * 组合创建并显示规约条件
         */
        Specification levelCheck = new LevelCheckSpecification(LevelType.Medium);
        Specification typeCheck = new SpecialityCheckSpecification(SpecialityType.Guangdong);
        Specification busyCheck = new StatusCheckSpecification();
        Specification spec = levelCheck.and(typeCheck.and(busyCheck));
        spec.display();

        /**
         * 从列表中选择符合条件的厨师
         */
        spec.choose(new Chef[]{cook1, cook2, cook3});
    }
}
