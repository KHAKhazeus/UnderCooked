package pipeline;


/**
 * 统一流水线处理单元，每个单元接收特定类型的输入，处理并返回特定类型的输出
 * @param <I> the input type of the handler
 * @param <O> the processed output type of the handler
 */
interface Handler<I, O> {
    O process(I input);
}
