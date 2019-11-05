package visitor;

public class Visit {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing Visitor:");
        System.out.println("===========================");

        var car = new Car();
        var maintainer = new CarMaintainer();
        car.accept(maintainer);
    }
}
