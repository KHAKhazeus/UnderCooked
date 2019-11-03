package chain_of_responsibility;
import Utils.Utils;

public class HeadDirector extends Director {

    public HeadDirector() {
        super(2);
    }

    @Override
    protected void cook() {
        Utils.logger.info("(" + this.toString() + "):" +"顶级主管完成了这道菜！");
    }
}
