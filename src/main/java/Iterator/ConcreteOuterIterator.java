package iterator;

/*
    OuterIterator with package-friendly setCollection function
 */


import Utils.Utils;

//配合ConcreteCollection一起使用的迭代器类
public class ConcreteOuterIterator implements Iterator{
    //由于外部类的结构，我们需要将迭代器与集合进行绑定
    void setCollection(ConcreteCollection target) {
        collection = target;
        cur = target.getData();
    }

    ConcreteCollection collection;

    //现在指向
    Object cur = null;

    //剩余参考ConcreteCollectionWithInnerIterator中的迭代器定义即可
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
