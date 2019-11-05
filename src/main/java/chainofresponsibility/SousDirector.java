package chainofresponsibility;
import Utils.Utils;

// 中级主管
public class SousDirector extends Director {

    public SousDirector() {
        // 调用父类构造函数传入等级
        super(1);
    }

    @Override
    protected void cook() {
        Utils.logger.info("(" + this.toString() + "):" +"中级主管完成了这道菜！");
    }
}
