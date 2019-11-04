package chain_of_responsibility;
import Utils.Utils;

// 总主管
public class ExecutiveDirector extends Director {

    public ExecutiveDirector() {
        // 调用父类构造函数传入等级
        super(3);
    }

    @Override
    protected void cook() {
        Utils.logger.info("(" + this.toString() + "):" +"总主管完成了这道菜！");
    }
}
