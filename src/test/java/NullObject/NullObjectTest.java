package NullObject;

import Delegation.Bakery;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NullObjectTest {
    @Test
    void main(){
        System.out.println();
        System.out.println("Testing NullObject");
        Bakery bakery = new Bakery();

        Cake cake1 = bakery.getCake("hhh");
    }

}