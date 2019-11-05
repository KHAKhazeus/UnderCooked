package iterator;

/*
    这里我们实际展示一种例子：有时需要对厨房周围的陌生人进行迭代的操作，
    如：发传单，查看是否有可疑行为等等
    这里我们先定义陌生人类来表示这类对象
 */
class Stranger{
    public Stranger(String name){
        this.name = name;
    }
    //陌生人的名字
    public String name;
}
