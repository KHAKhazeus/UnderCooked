package Iterator;

/*
    OuterIterator with package-friendly setCollection function
 */


import Utils.Utils;

public class ConcreteOuterIterator implements Iterator{
    void setCollection(ConcreteCollection target) {
        collection = target;
        cur = target.getData();
    }

    ConcreteCollection collection;
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
            Object data = collection.getData();
            cur = data;
            if (data != null){
                Utils.logger.info("(" + this.toString() + ") : " + "Data Returned by ConcreteInnerIterator");
            }
            else{
                Utils.logger.error("(" + this.toString() + ") : " + "ConcreteCollectionWithInnerIterator Failure");
                System.exit(1);
            }
            return this;
        }
        else{
            Utils.logger.info("(" + this.toString() + ") : " + "no other elements!");
            return null;
        }
    }

    @Override
    public Object deduce(){
        if(cur == null){
            Utils.logger.error("(" + this.toString() + ") : " + "Wandering main.java.Iterator!");
            System.exit(1);
            return null;
        }
        else{
            Utils.logger.info("(" + this.toString() + ") : " + "Successfully deduced!");
            return cur;
        }
    }
}
