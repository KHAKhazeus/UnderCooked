package dependencyinjection;

public class DependencyInjection {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing DependencyInjection:");
        System.out.println("===========================");

        Cook cook = new Cook();
        // 厨师通过一个接口完成不同的菜
        cook.cook(new SteamingDish());
        cook.cook(new FryingDish());
    }
}
