package frontcontroller;

public class FrontCtrl {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing FrontController:");
        System.out.println("===========================");

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME", "Jack");
        frontController.dispatchRequest("PLAYER", "Jack");
        frontController.dispatchRequest("PLAYER", "Admin");
    }
}
