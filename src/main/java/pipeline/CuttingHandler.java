package pipeline;

import Utils.Utils;
import org.apache.logging.log4j.Logger;

public class CuttingHandler implements Handler<ShavedPotato, RawFries> {
    private static final Logger LOGGER = Utils.logger;

    @Override
    public RawFries process(ShavedPotato input) {
        LOGGER.info("(" + this.toString() + ") : " + "切土豆单元 将削好的土豆切成条");
        return new RawFries();
    }

}
