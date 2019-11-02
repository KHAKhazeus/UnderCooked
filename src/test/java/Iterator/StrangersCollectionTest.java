package Iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrangersCollectionTest {
    @Test
    void main(){

        StrangersCollection coll = new StrangersCollection();
        coll.insert("Cheng");
        coll.insert("Nice");
        Iterator it = coll.iterator();
        System.out.println(it.deduce());
        System.out.println(it.hasNext());
        System.out.println(it.deduce());
        System.out.println(it.next().deduce());
    }
}