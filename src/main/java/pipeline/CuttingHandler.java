package pipeline;

import Utils.Utils;
import org.apache.logging.log4j.Logger;

public class CuttingHandler implements Handler<ShavedPotato, RawFries> {
    private static final Logger LOGGER = Utils.logger;

    @Override
    public RawFries process(ShavedPotato input) {
        LOGGER.info("(" + this.toString() + ") : " + "Cutting Handler is cutting potato");
        return new RawFries();
    }

}
