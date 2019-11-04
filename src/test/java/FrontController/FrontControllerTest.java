package FrontController;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrontControllerTest {
    @Test
    void main(){
        System.out.println("FrontController:");
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME", "Jack");
        frontController.dispatchRequest("PLAYER", "Jack");
        frontController.dispatchRequest("PLAYER", "Admin");
    }
}