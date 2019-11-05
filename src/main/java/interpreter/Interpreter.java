package interpreter;

import Utils.Utils;

public class Interpreter {
    public void test() {

        System.out.println("===========================");
        System.out.println("Testing Interpreter:");
        System.out.println("===========================");

        Utils.logger.info("(" + this.toString() + ") : " + "Testing Interpreter");
        String[] str = {"XCBDF", "2", "TCLJ", "1", "MPDF", "3"};
        Context context = new Context(str);
        Node Interpreter = new ExpressionNode();
        Interpreter.Interpret(context);
        Interpreter.Execute();
    }
}
