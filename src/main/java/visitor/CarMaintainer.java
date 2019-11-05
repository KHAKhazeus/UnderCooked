package visitor;


import Utils.Utils;
import org.apache.logging.log4j.Logger;

public class CarMaintainer implements Visitor {
    public static final Logger logger = Utils.logger;

    public void visit(Wheel wheel) {
        String prefix = String.format("(%s) : ", this.toString());
        logger.info(prefix + "正在维护 " + wheel.getName()
                + "轮");
        logger.info(this);
    }
    public void visit(Engine engine) {
        String prefix = String.format("(%s) : ", this.toString());
        logger.info(prefix + "正在维护引擎");
    }
    public void visit(Body body) {
        String prefix = String.format("(%s) : ", this.toString());
        logger.info(prefix + "正在维护车身");
    }
    public void visit(Car car) {
        String prefix = String.format("(%s) : ", this.toString());
        logger.info(prefix + "正在维护整车");
    }
}
