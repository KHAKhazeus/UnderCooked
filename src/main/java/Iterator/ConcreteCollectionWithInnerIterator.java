package iterator;

import Utils.Utils;

public class ConcreteCollectionWithInnerIterator implements Collection{

    class ConcreteInnerIterator implements Iterator{

        Object cur = null;

        @Override
        public Boolean hasNext() {
            Utils.logger.info("(" + this.toString() + ") : " + "found another one!");
            return true;
        }

        @Override
        public Iterator next(){
            if (hasNext()){
                Utils.logger.info("(" + this.toString() + ") : " + "got another one, returning");
                Object data = getData();
                cur = data;
                if (data != null){
                    Utils.logger.info("(" + this.toString() + ") : " + "Data Returned by ConcreteInnerIterator");
                    return this;
                }
                else{
                    Utils.logger.error("(" + this.toString() + ") : " + "ConcreteCollectionWithInnerIterator Failure");
                    System.exit(1);
                    return null;
                }
            }
            else{
                Utils.logger.info("(" + this.toString() + ") : " + "no other elements!");
                return null;
            }
        }

        @Override
        public Object deduce(){
            if(cur == null){
                Utils.logger.error("(" + this.toString() + ") : " + "Wandering main.java.iterator!");
                System.exit(1);
                return null;
            }
            else{
                Utils.logger.info("(" + this.toString() + ") : " + "Successfully deduced!");
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
        Utils.logger.info("(" + this.toString() + ") : " + "ConcreteCollection: new Element");
        size++;
    }

    @Override
    public void clear() {
        Utils.logger.info("(" + this.toString() + ") : " + "Clearing collections");
    }

    @Override
    public Iterator iterator() {
        return new ConcreteInnerIterator();
    }
}
