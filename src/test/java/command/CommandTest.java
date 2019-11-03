package command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandTest {
    @Test
    void main() {
        Waiter waiter = new Waiter();
        Cook cook = new Cook();

        waiter.addOrder(new BakingOrder(cook));
        waiter.executeOrder();
    }
}