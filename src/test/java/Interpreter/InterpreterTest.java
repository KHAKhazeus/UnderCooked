package Interpreter;

import Utils.Utils;
import org.junit.jupiter.api.Test;

class InterpreterTest {
    @Test
    void main() {
        Utils.logger.info("(" + this.toString() + ") : " + "Testing Interpreter");
        String[] str = {"XCBDF", "2", "TCLJ", "1", "MPDF", "3"};
        Context context = new Context(str);
        Node Interpreter = new ExpressionNode();
        Interpreter.Interpret(context);
        Interpreter.Execute();
    }

}