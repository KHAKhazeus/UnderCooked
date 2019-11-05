package iterator;

/*
    Not a really practical Collection!
 */

import Utils.Utils;

//对于支持迭代器的集合的一种实现方式，将迭代器完全与集合分开（不推荐）
public class ConcreteCollection implements Collection{

    private int size = 0;

    //模拟存储的数据，因为这并不是一个真正会向用户开放存储的类，只是一个PROTOTYPE
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

    //模拟插入新数据
    public void insert(Object thing) {
        data = thing;
        Utils.logger.info(this + " : 新元素");
        size++;
    }

    @Override
    public void clear() {
        Utils.logger.info(this + " : 创建集合");
    }

    @Override
    public ConcreteOuterIterator iterator() {
        ConcreteOuterIterator iterator = new ConcreteOuterIterator();
        iterator.setCollection(this);
        return iterator;
    }
}
