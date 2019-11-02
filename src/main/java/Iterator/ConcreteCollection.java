package main.java.Iterator;

/*
    Not a really practical Collection!
 */

public class ConcreteCollection implements Collection{

    private int size = 0;

    private Object data;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size() > 0;
    }

    Object getData(){
        return data;
    }

    public void insert(Object thing) {
        data = thing;
        System.out.println("ConcreteCollection: new Element");
        size++;
    }

    @Override
    public void clear() {
        System.out.println("ConcreteCollection: Clearing collections");
    }

    @Override
    public ConcreteOuterIterator iterator() {
        ConcreteOuterIterator iterator = new ConcreteOuterIterator();
        iterator.setCollection(this);
        return iterator;
    }
}
