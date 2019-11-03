package chain_of_responsibility;
import Utils.Utils;

public class SousDirector extends Director {

    public SousDirector() {
        super(1);
    }

    @Override
    protected void cook() {
        Utils.logger.info("(" + this.toString() + "):" +"中级主管完成了这道菜！");
    }
}
