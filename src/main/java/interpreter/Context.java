package interpreter;

/**
 * @description: interpreter使用的上下文，interpreter通过解析该上下文得到需要执行的操作
 * @author: ldy
 */
public class Context {
    private String[] data;
    private Integer currentIndex = 0;

    public Context(String[] _data) {
        data = _data;
    }


    /**
     * @description: 获取当前符号
     * @author: ldy
     */
    public String getCurrentToken() {
        if (currentIndex < data.length)
            return data[currentIndex];
        else
            return "END";
    }

    /**
     * @description: 将符号指示器后移一位，下次调用getCurrentToken可以得到后面的符号
     * @author: ldy
     */
    public void nextToken() {
        currentIndex++;
    }
}
