package dependency_injection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DependencyInjectionTest {
    @Test
    void main() {
        Cook cook = new Cook();
        // 厨师通过一个接口完成不同的菜
        cook.cook(new SteamingDish());
        cook.cook(new FryingDish());
    }
}