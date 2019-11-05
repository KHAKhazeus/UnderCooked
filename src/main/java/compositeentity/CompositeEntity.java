package compositeentity;

public class CompositeEntity {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing CompositeEntity:");
        System.out.println("===========================");

        Client client=new Client();
        client.setName("鸡肉","番茄");
        System.out.printf("这道菜是");
        client.printName();
        client.setName("牛肉","番茄");
        System.out.printf("这道菜是");
        client.printName();
        client.setName("鸡肉","土豆");
        System.out.printf("这道菜是");
        client.printName();
    }
}
