package frontcontroller;

public class FrontCtrl {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing FrontController:");
        System.out.println("===========================");

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("主页", "张三");
        frontController.dispatchRequest("玩家页", "管理员");
    }
}
