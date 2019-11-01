package Iterator;

public class ConcreteIterator implements Iterator{

    ConcreteCollection collection;
    @Override
    public Boolean hasNext() {
        System.out.println("ConcreteIterator: found another one!");
        return ture;
    }

    @Override
    public Iterator next() {
        if (hasNext()){
            System.out.println("ConcreteIterator: got another one, returning");
        }
        else{
            System.out.println("ConcreteIterator: no other elements! ");
            return null;
        }
    }
}
