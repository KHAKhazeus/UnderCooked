package chainofresponsibility;

public class ChainOfResponsibility {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing ChainOfResponsibility:");
        System.out.println("===========================");

        // 创建不同级别的订单
        int[] orderLevels = new int[]{1, 2, 0, 3, 6};

        // 四种级别的厨师
        CommisDirector commisDirector = new CommisDirector();
        SousDirector sousDirector = new SousDirector();
        HeadDirector headDirector = new HeadDirector();
        ExecutiveDirector executiveDirector = new ExecutiveDirector();

        // 设置责任链的关系
        commisDirector.setNext(sousDirector);
        sousDirector.setNext(headDirector);
        headDirector.setNext(executiveDirector);

        for (int orderLevel: orderLevels) {
            commisDirector.handleOrder(new Order(orderLevel));
        }
    }
}
