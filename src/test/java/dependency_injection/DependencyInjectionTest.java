package dependency_injection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DependencyInjectionTest {
    @Test
    void main() {
        Cook cook = new Cook();
        cook.cook(new SteamingDish());
        cook.cook(new FryingDish());
    }
}