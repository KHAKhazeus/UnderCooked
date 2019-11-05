package iterator;

import Utils.Utils;

import java.util.ArrayList;

//利用嵌入类的方式实现对陌生人集合的迭代
public class StrangersCollection extends ConcreteCollectionWithInnerIterator{

    private ArrayList list = new ArrayList();

    //内部迭代器
    class ConcreteInnerStrangersIterator implements Iterator{

        //指针，由于是线性存储，因此利用下标即可
        int cur = 0;

        //将指针自定义在一个位置，在这儿我们不对有效性进行检测，推迟到使用迭代器的未来的方法中进行检测
        ConcreteInnerStrangersIterator(int startFrom){
            cur = startFrom;
        }
        //默认初始化
        ConcreteInnerStrangersIterator(){
            cur = 0;
        }

        @Override
        public Boolean hasNext() {
            //检查下一个的指针是否有效
            if ((cur + 1) >=0 && (cur + 1) < list.size()){
                Utils.logger.info("(" + this.toString() + ") : " + "找到了下一个!");
                return true;
            }
            else {
                return false;
            }
        }

        //下一位陌生人
        @Override
        public Iterator next(){
            if (hasNext()){
                Utils.logger.info("(" + this.toString() + ") : " + "返回下一个陌生人");
                Stranger data = getData(cur + 1);
                if (data != null){
                    cur++;
                    Utils.logger.info("(" + this.toString() + ") : " + "下一个陌生人到了（做点什么）！");
                    Utils.logger.info("(" + this.toString() + ") : " + "下一个陌生人的名字: " + data.name);
                }
                else{
                    Utils.logger.error("(" + this.toString() + ") : " + "StrangerCollection 出错！");
                    System.exit(1);
                }
                return this;
            }
            else{
                Utils.logger.info("(" + this.toString() + ") : " + "没有其他陌生人了!");
                return null;
            }
        }

        //查看陌生人
        @Override
        public Stranger deduce(){
            //保证目前指向的目标有效
            if(cur < 0 || cur >= list.size()){
                Utils.logger.error("(" + this.toString() + ") : " + "Wandering main.java.iterator!");
                System.exit(1);
                return null;
            }
            else{
                Utils.logger.info("(" + this.toString() + ") : " + "Successfully deduced!");
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

    //获取指定下标的陌生人
    private Stranger getData(int index) {
        if (index < list.size() && index >= 0){
            return (Stranger)list.get(index);
        }
        else{
            return null;
        }
    }

    //新的陌生人
    public void insert(String name) {
        Stranger stranger = new Stranger(name);
        Utils.logger.info("(" + this.toString() + ") : " + "New Stranger inserted in StrangerCollection!");
        list.add(stranger);
        size++;
    }

    //清除集合
    @Override
    public void clear() {
        list.clear();
    }

    //默认迭代器创建方法
    @Override
    public Iterator iterator() {
        return new ConcreteInnerStrangersIterator();
    }

    //创建迭代器，从一定下标开始
    public Iterator iterator(int startFrom) {
        if (startFrom >=0 && startFrom < list.size()){
            return new ConcreteInnerStrangersIterator(startFrom);
        }
        else{
            return null;
        }
    }
}
