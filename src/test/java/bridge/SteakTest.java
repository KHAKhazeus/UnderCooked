package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SteakTest {
    @Test
    void main() {
        Steak mediumWellSirloin = new SirloinSteak(new MediumWell());
        Steak mediumRareFilet = new FiletSteak(new MediumRare());

        mediumWellSirloin.cook();
        mediumRareFilet.cook();
    }
}