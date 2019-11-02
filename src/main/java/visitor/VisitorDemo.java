package visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        var car = new Car();
        var maintainer = new CarMaintainer();
        car.accept(maintainer);
    }
}
