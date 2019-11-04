package dependency_injection;

public class DependencyInjection {
    public static void test() {
        Cook cook = new Cook();
        // 厨师通过一个接口完成不同的菜
        cook.cook(new SteamingDish());
        cook.cook(new FryingDish());
    }
}
