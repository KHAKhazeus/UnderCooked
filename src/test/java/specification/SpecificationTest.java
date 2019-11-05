package specification;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecificationTest {
    @Test
    void main(){
        System.out.println("Test Specification");
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