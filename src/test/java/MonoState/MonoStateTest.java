package MonoState;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonoStateTest {
    @Test
    void main(){
        System.out.println("MonoState:");
        SpecialToday specialTodayInnerBanner = new SpecialToday();
        System.out.println("初始化specialTodayInnerBanner:");
        specialTodayInnerBanner.showSpecialToday();
        SpecialToday specialTodayOutsideBanner = new SpecialToday();
        System.out.println("初始化specialTodayOutsideBanner:");
        specialTodayOutsideBanner.showSpecialToday();
        System.out.println("修改specialTodayInnerBanner:");
        specialTodayInnerBanner.setSpecialToday("培根三明治");
        specialTodayInnerBanner.showSpecialToday();
        System.out.println("specialTodayOutsideBanner:");
        specialTodayOutsideBanner.showSpecialToday();

    }
}