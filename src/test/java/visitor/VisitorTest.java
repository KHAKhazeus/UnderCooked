package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisitorTest {
    @Test
    void main(){
        var car = new Car();
        var maintainer = new CarMaintainer();
        car.accept(maintainer);
    }
}