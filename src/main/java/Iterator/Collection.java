package iterator;

//集合
public interface Collection{
    public int size();
    //清空集合
    public void clear();
    //返回迭代器
    public Iterator iterator();
}
