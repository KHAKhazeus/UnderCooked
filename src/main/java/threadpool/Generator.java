package threadpool;
// 食材工厂接口

public interface Generator {
    public void addCook(Cook cook);// 添加观察者

    public void deleteCook(Cook cook);// 删除观察者
}
