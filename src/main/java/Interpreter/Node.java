package Interpreter;

/**
 * @description: interpreter使用的节点抽象类
 * @author: ldy
 */
public abstract class Node {
    public abstract void Interpret(Context context);

    public abstract void Execute();
}
