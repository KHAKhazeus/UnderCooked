package iterator;

import Utils.Utils;

//对于支持迭代器的集合的一种实现方式，将自定义的迭代器类作为内部类进行封装
public class ConcreteCollectionWithInnerIterator implements Collection{

    //内部自定义迭代器类
    class ConcreteInnerIterator implements Iterator{

        Object cur = null;

        //查看是否还有元素，由于大类并不是真正能向用户开放使用的类（没有存储能力），因此此处只是模拟
        @Override
        public Boolean hasNext() {
            Utils.logger.info("(" + this.toString() + ") : " + "found another one!");
            return true;
        }

        //取出下一个数据
        @Override
        public Iterator next(){
            if (hasNext()){
                Utils.logger.info("(" + this.toString() + ") : " + "got another one, returning");
                //调用父类的方法获取数据
                Object data = getData();
                cur = data;
                //取出数据出错
                if (data != null){
                    Utils.logger.info("(" + this.toString() + ") : " + "Data Returned by ConcreteInnerIterator");
                    return this;
                }
                else{
                    //经过hasNext检查仍然出错
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

        //对迭代器指向的对象进行解析，返回其指向的目标
        @Override
        public Object deduce(){
            //检查当前的迭代器是否为游荡的迭代器
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
