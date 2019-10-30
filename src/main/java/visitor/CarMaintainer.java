package visitor;

public class CarMaintainer implements Visitor {
    public void visit(Wheel wheel) {
        System.out.println("Maintaining " + wheel.getName()
                + " wheel");
    }
    public void visit(Engine engine) {
        System.out.println("Maintaining engine");
    }
    public void visit(Body body) {
        System.out.println("Maintaining body");
    }
    public void visit(Car car) {
        System.out.println("Maintaining car");
    }
}
