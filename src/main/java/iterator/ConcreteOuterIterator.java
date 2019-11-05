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
        Utils.logger.info("(" + this.toString() + ") : " + "找到了下一个!");
        return true;
    }

    @Override
    public Iterator next(){
        if (hasNext()){
            Utils.logger.info("(" + this.toString() + ") : " + "返回下一个");
            Object data = collection.getData();
            cur = data;
            if (data != null){
                Utils.logger.info("(" + this.toString() + ") : " + "ConcreteOuterIterator 已经指向下一个数据");
            }
            else{
                Utils.logger.error("(" + this.toString() + ") : " + "ConcreteCollection 出错");
                System.exit(1);
            }
            return this;
        }
        else{
            Utils.logger.info("(" + this.toString() + ") : " + "没有其他元素了！!");
            return null;
        }
    }

    @Override
    public Object deduce(){
        if(cur == null){
            Utils.logger.error("(" + this.toString() + ") : " + "空迭代器!");
            System.exit(1);
            return null;
        }
        else{
            Utils.logger.info("(" + this.toString() + ") : " + "成功解析!");
            return cur;
        }
    }
}
