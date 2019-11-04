package pipeline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PipelineTest {
    @Test
    void testAddHandlersToPipeline() {
        Pipeline<Potato, RawFries> friesPipeline = new Pipeline<>(new ShavingHandler())
                .addHandler(new CuttingHandler());

        friesPipeline.execute(new Potato());
    }
}