package Iterator;

import Utils.Utils;

import java.util.ArrayList;

public class StrangersCollection extends ConcreteCollectionWithInnerIterator{

    private ArrayList list = new ArrayList();

    class ConcreteInnerStrangersIterator implements Iterator{

        int cur = 0;

        ConcreteInnerStrangersIterator(int startFrom){
            cur = startFrom;
        }

        ConcreteInnerStrangersIterator(){
            cur = 0;
        }

        @Override
        public Boolean hasNext() {
            if ((cur + 1) >=0 && (cur + 1) < list.size()){
                Utils.decorateLog(this, "found another one!");
                return true;
            }
            else {
                return false;
            }
        }

        @Override
        public Iterator next(){
            if (hasNext()){
                Utils.decorateLog(this, "fetching next Stranger");
                Stranger data = getData(cur + 1);
                if (data != null){
                    cur++;
                    System.out.println("Next Customer arrived (DO SOMETHING!)");
                    System.out.println("Next Customer named: " + data.name);
                }
                else{
                    System.out.println("StrangerCollection Failure");
                    System.exit(1);
                }
                return this;
            }
            else{
                System.out.println("ConcreteInnerStrangersIterator: no other elements! ");
                return null;
            }
        }

        @Override
        public Stranger deduce(){
            if(cur < 0 || cur >= list.size()){
                System.out.println("ConcreteInnerStrangersIterator: Wandering main.java.Iterator!");
                System.exit(1);
                return null;
            }
            else{
                System.out.println("ConcreteInnerStrangersIterator: Successfully deduced!");
                return getData(cur);
            }
        }
    }
    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    private Stranger getData(int index) {
        if (index < list.size() && index >= 0){
            return (Stranger)list.get(index);
        }
        else{
            return null;
        }
    }

    public void insert(String name) {
        Stranger stranger = new Stranger(name);
        System.out.println("New Stranger inserted in StrangerCollection!");
        list.add(stranger);
        size++;
    }

    @Override
    public void clear() {
        super.clear();
        list.clear();
    }

    @Override
    public Iterator iterator() {
        return new ConcreteInnerStrangersIterator();
    }

    public Iterator iterator(int startFrom) {
        if (startFrom >=0 && startFrom < list.size()){
            return new ConcreteInnerStrangersIterator(startFrom);
        }
        else{
            return null;
        }
    }
}
