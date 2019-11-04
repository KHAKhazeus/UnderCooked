package pipeline;

import Utils.Utils;
import org.apache.logging.log4j.Logger;

public class ShavingHandler implements Handler<Potato, ShavedPotato> {
    private static final Logger LOGGER = Utils.logger;

    @Override
    public ShavedPotato process(Potato input) {
        LOGGER.info("(" + this.toString() + ") : " + "Shaving Handler is shaving potato");
        return new ShavedPotato();
    }
}
