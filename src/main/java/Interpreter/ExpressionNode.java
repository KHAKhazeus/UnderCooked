package Interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: interpreter使用的表达式节点类，可以理解为以S打头的非终结符
 * @author: ldy
 */
public class ExpressionNode extends Node {
    private List<Node> nodes = new ArrayList<Node>();

    /**
     * @description: 读取上下文，下放到DishNode处理
     * @author: ldy
     * @param: [context]
     */
    public void Interpret(Context context) {
        while (context.getCurrentToken() != "END") {
            Node n = new DishNode();
            n.Interpret(context);
            nodes.add(n);
        }
    }

    /**
     * @description: 依次执行所有的DishNode
     * @author: ldy
     */
    public void Execute() {
        for (Node n : nodes) {
            n.Execute();
        }
    }
}
