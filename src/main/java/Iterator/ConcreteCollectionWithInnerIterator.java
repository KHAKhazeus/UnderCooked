package Iterator;

public class ConcreteCollectionWithInnerIterator implements Collection{

    class ConcreteInnerIterator implements Iterator{

        Object cur = null;

        @Override
        public Boolean hasNext() {
            System.out.println("ConcreteInnerIterator: found another one!");
            return true;
        }

        @Override
        public Iterator next(){
            if (hasNext()){
                System.out.println("ConcreteInnerIterator: got another one, returning");
                Object data = getData();
                cur = data;
                if (data != null){
                    System.out.println("Data Returned by ConcreteInnerIterator");
                    return this;
                }
                else{
                    System.out.println("ConcreteCollectionWithInnerIterator Failure");
                    System.exit(1);
                    return null;
                }
            }
            else{
                System.out.println("ConcreteInnerIterator: no other elements! ");
                return null;
            }
        }

        @Override
        public Object deduce(){
            if(cur == null){
                System.out.println("ConcreteInnerIterator: Wandering main.java.Iterator!");
                System.exit(1);
                return null;
            }
            else{
                System.out.println("ConcreteInnerIterator: Successfully deduced!");
                return cur;
            }
        }
    }

    int size = 0;

    private Object data;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size() > 0;
    }

    final Object getData(){
        return data;
    }

    void insert(Object thing) {
        data = thing;
        System.out.println("ConcreteCollection: new Element");
        size++;
    }

    @Override
    public void clear() {
        System.out.println("ConcreteCollection: Clearing collections");
    }

    @Override
    public Iterator iterator() {
        return new ConcreteInnerIterator();
    }
}
