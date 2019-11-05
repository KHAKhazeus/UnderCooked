package mediator;

public class Mediator {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing Mediator:");
        System.out.println("===========================");

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
        kitchen.inputMessage("鸡翅准备好了!");
        procurement.inputMessage("食材采购完毕!");
        reception.inputMessage("客人到了，并且已经点餐!");

    }
}
