package visitor;

class Wheel {
    private String name;
    Wheel(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class Engine {
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class Body {
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

public class Car {
    private Engine  engine = new Engine();
    private Body    body   = new Body();
    private Wheel[] wheels
            = { new Wheel("front left"), new Wheel("front right"),
            new Wheel("back left") , new Wheel("back right")  };
    void accept(Visitor visitor) {
        visitor.visit(this);
        engine.accept(visitor);
        body.accept(visitor);
        for (int i = 0; i < wheels.length; ++ i)
            wheels[i].accept(visitor);
    }
}
