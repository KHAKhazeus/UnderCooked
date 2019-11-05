package monostate;

public class MonoState {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing MonoState:");
        System.out.println("===========================");

        SpecialToday specialTodayInnerBanner = new SpecialToday();
        System.out.println("初始化厨房内的显示屏：");
        specialTodayInnerBanner.showSpecialToday();
        SpecialToday specialTodayOutsideBanner = new SpecialToday();
        System.out.println("初始化厨房外的显示屏：");
        specialTodayOutsideBanner.showSpecialToday();
        System.out.println("修改厨房内的显示屏：");
        specialTodayInnerBanner.setSpecialToday("培根三明治");
        specialTodayInnerBanner.showSpecialToday();
        System.out.println("厨房外的显示屏：");
        specialTodayOutsideBanner.showSpecialToday();
    }
}
