package Mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InformationSystemTest {
    @Test
    void main(){
        String xml = "CONFIGURATION STRING";
        GrandMaster master = InformationMaster.getInstance(xml);
        InformationSystem kitchen = new Kitchen<String>();
        InformationSystem procurement = new Procurement<String>();
        InformationSystem reception = new Reception<String>();
        kitchen.register(master);
        procurement.register(master);
        reception.register(master);
        kitchen.inputMessage("Chicken Ready!");
        procurement.inputMessage("Ingredients Ready!");
        reception.inputMessage("Customers arrived and new order has come!");
    }

}