package mediator;

import org.junit.jupiter.api.Test;

class InformationSystemTest {
    @Test
    void main(){
        //模拟配置XML
        String xml = "CONFIGURATION STRING";
        GrandMaster master = InformationMaster.getInstance(xml);
        InformationSystem kitchen = new Kitchen<String>();
        InformationSystem procurement = new Procurement<String>();
        InformationSystem reception = new Reception<String>();
        //进行信息系统的注册
        kitchen.register(master);
        procurement.register(master);
        reception.register(master);
        //信息传递
        kitchen.inputMessage("Chicken Ready!");
        procurement.inputMessage("Ingredients Ready!");
        reception.inputMessage("Customers arrived and new order has come!");
    }

}