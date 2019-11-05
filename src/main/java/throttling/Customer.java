package throttling;

interface Customer{
    //下订单
    void placeOrder(String order);
    //改变使用的系统
    void changeSystem(OnlineOrderSystem system);
}
