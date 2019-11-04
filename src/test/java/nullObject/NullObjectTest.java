package nullObject;

import delegation.Bakery;
import org.junit.jupiter.api.Test;

class NullObjectTest {
    @Test
    void main(){
        System.out.println();
        System.out.println("Testing NullObject");
        Bakery bakery = new Bakery();

        Cake cake1 = bakery.getCake("hhh");
    }

}