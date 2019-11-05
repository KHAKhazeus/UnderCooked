package interpreter;

import Utils.Utils;

/**
 * @description: interpreter的执行节点。读取菜名和数量，在清单中打印对应项目
 * @author: ldy
 */
public class DishNode extends Node {
    private String dishName;
    private Integer num;
    private Integer unitPrice;

    /**
     * @description: 读取菜名和数量
     * @author: ldy
     * @param: [context]需要解析的上下文
     */
    public void Interpret(Context context) {
        if (context.getCurrentToken() == "MPDF") {
            dishName = "麻婆豆腐";
            unitPrice = 34;
        } else if (context.getCurrentToken() == "TCLJ") {
            dishName = "糖醋里脊";
            unitPrice = 58;
        } else if (context.getCurrentToken() == "XCBDF") {
            dishName = "小葱拌豆腐";
            unitPrice = 25;
        }
        context.nextToken();
        num = Integer.parseInt(context.getCurrentToken());
        context.nextToken();
    }

    /**
     * @description: 节点的执行操作，在清单中输出对应的行
     * @author: ldy
     */
    public void Execute() {
        Utils.logger.info("(" + this.toString() + ") : " + dishName + "    " + "数量： " + num + "    总价： " + num * unitPrice + "\n");
    }
}
