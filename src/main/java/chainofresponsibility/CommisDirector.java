package chainofresponsibility;
import Utils.Utils;

// 初级主管
public class CommisDirector extends Director {

    public CommisDirector() {
        // 调用父类构造函数传入等级
        super(0);
    }

    @Override
    protected void cook() {
        Utils.logger.info("(" + this.toString() + "):" +"初级主管完成了这道菜！");
    }
}
