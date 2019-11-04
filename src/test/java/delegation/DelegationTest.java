package delegation;

import org.junit.jupiter.api.Test;

class DelegationTest {
    @Test
    void main(){
        System.out.println();
        System.out.println("Testing Delegation");
        Bakery bakery = new Bakery();
        bakery.getCake("Black Forest Cake");
        bakery.getCake("Buff Cake");
        bakery.getCake("lalala");
    }

}