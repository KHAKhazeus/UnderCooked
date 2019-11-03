package iterator;

import Utils.Utils;
import org.junit.jupiter.api.Test;

class IteratorTest {

    @Test
    void main(){
        StrangersCollection coll = new StrangersCollection();
        coll.insert("Cheng");
        coll.insert("Nice");
        Iterator it = coll.iterator();
        Utils.logger.debug("(" + this.toString() + ") : " + it.deduce());
        Utils.logger.debug("(" + this.toString() + ") : " + it.hasNext());
        Utils.logger.debug("(" + this.toString() + ") : " + it.deduce());
        Utils.logger.debug("(" + this.toString() + ") : " + it.next().deduce());
    }

}