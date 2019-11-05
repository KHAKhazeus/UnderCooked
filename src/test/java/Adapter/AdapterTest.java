package Adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdapterTest {
    @Test
    void main(){
        System.out.println("Adapter:");
        CookingPot cookingPot = new CookingPot();
        cookingPot.cook("egg", 50);
        cookingPot.cook("meat", 50);
    }
}