package pipeline;


/**
 * 流水线主类，初始一个Handler，
 * @param <I> 流水线的输入类型
 * @param <O> 流水线的输出类型
 */
class Pipeline<I, O> {

    private final Handler<I, O> currentHandler;

    Pipeline(Handler<I, O> currentHandler) {
        this.currentHandler = currentHandler;
    }

    <K> Pipeline<I, K> addHandler(Handler<O, K> newHandler) {
        return new Pipeline<>(input -> newHandler.process(currentHandler.process(input)));
    }

    O execute(I input) {
        return currentHandler.process(input);
    }
}