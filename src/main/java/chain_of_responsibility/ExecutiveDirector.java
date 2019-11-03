package chain_of_responsibility;
import Utils.Utils;

public class ExecutiveDirector extends Director {

    public ExecutiveDirector() {
        super(3);
    }

    @Override
    protected void cook() {
        Utils.logger.info("(" + this.toString() + "):" +"总主管完成了这道菜！");
    }
}
