package chain_of_responsibility;
import Utils.Utils;

public class CommisDirector extends Director {

    public CommisDirector() {
        super(0);
    }

    @Override
    protected void cook() {
        Utils.logger.info("(" + this.toString() + "):" +"初级主管完成了这道菜！");
    }
}
