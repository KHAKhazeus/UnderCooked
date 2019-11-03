package memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mementoTest {
    @Test
    void main(){
        System.out.println("Test memento:");
        var memento = new menu();
        menu.Volume(20);
        menu.Save();
    }
}
