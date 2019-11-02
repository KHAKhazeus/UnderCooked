package main.java.Iterator;

/*
    OuterIterator with package-friendly setCollection function
 */

import org.jetbrains.annotations.NotNull;

public class ConcreteOuterIterator implements Iterator{
    void setCollection(@NotNull ConcreteCollection target) {
        collection = target;
        cur = target.getData();
    }

    ConcreteCollection collection;
    Object cur = null;

    @Override
    public Boolean hasNext() {
        System.out.println("ConcreteOuterIterator: found another one!");
        return true;
    }

    @Override
    public Iterator next(){
        if (hasNext()){
            System.out.println("ConcreteOuterIterator: got another one, returning");
            Object data = collection.getData();
            cur = data;
            if (data != null){
                System.out.println("Data Returned by ConcreteOuterIterator");
            }
            else{
                System.out.println("ConcreteCollection Failure!");
                System.exit(1);
            }
            return this;
        }
        else{
            System.out.println("ConcreteOuterIterator: no other elements! ");
            return null;
        }
    }

    @Override
    public Object deduce(){
        if(cur == null){
            System.out.println("ConcreteOuterIterator: Wandering main.java.Iterator!");
            System.exit(1);
            return null;
        }
        else{
            System.out.println("ConcreteOuterIterator: Successfully deduced!");
            return cur;
        }
    }
}
