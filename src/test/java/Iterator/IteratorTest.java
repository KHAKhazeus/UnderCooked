package iterator;

import Utils.Utils;
import org.junit.jupiter.api.Test;

class IteratorTest {

    @Test
    void main(){
        //陌生人集合
        StrangersCollection coll = new StrangersCollection();
        coll.insert("Cheng");
        coll.insert("Nice");
        //获得迭代器，从0下标开始
        Iterator it = coll.iterator();
        //测试解析
        Utils.logger.debug("(" + this.toString() + ") : " + it.deduce());
        Utils.logger.debug("(" + this.toString() + ") : " + it.hasNext());
        Utils.logger.debug("(" + this.toString() + ") : " + it.deduce());
        Utils.logger.debug("(" + this.toString() + ") : " + it.next().deduce());
    }

}