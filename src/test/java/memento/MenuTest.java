package memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MementoTest {
    @Test
    void main(){
        System.out.println("Testing memento:");
        var memento = new Menu();
        memento.Volume(20);
        memento.Save();
    }
}
