package chainofresponsibility;
import Utils.Utils;

// 顶级主管
public class HeadDirector extends Director {

    public HeadDirector() {
        // 调用父类构造函数传入等级
        super(2);
    }

    @Override
    protected void cook() {
        Utils.logger.info("(" + this.toString() + "):" +"顶级主管完成了这道菜！");
    }
}
