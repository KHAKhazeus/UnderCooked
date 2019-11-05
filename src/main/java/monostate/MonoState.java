package monostate;

public class MonoState {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing MonoState:");
        System.out.println("===========================");

//        System.out.println("MonoState:");
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
