package Delegation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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