
import Iterator.Iterator;
import Iterator.StrangersCollection;

public class TestUse {
    public static void main(String[] args) {
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
