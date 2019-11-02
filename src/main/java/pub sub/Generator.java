public interface Generator {
    public void addCook(Cook cook);// 添加观察者

    public void deleteCook(Cook cook);// 删除观察者

    public void notifyAllCook(String msg);// 通知所有的观察者
}
