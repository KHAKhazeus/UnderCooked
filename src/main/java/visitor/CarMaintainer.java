package visitor;


import Utils.Utils;
import org.apache.logging.log4j.Logger;

public class CarMaintainer implements Visitor {
    public static final Logger logger = Utils.logger;

    public void visit(Wheel wheel) {
        logger.info("Maintaining " + wheel.getName()
                + " wheel");
        logger.info(this);
    }
    public void visit(Engine engine) {
        logger.info("Maintaining engine");
    }
    public void visit(Body body) {
        logger.info("Maintaining body");
    }
    public void visit(Car car) {
        logger.info("Maintaining car");
    }
}
