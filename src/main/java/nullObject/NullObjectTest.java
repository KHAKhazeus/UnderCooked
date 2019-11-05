package nullObject;
import delegation.*;

public class NullObjectTest {
    public static void main(String[] args) {
        Bakery bakery = new Bakery();
        Cake cake = bakery.getCake("cake");
        Cake cake1 = bakery.getCake("hhh");
    }
}
