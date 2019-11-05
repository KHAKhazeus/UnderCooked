package activeobject;

public class ActiveObject {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing ActiveObject");
        System.out.println("===========================");

        /**
         * 初始化一个公告牌实例
         */
        NotifyBoard notifyBoard =   new NotifyBoard();

        /**
         * 发布公告
         */
        try {
            notifyBoard.changeNotifyBoard("时间快到了，抓紧上菜!");

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        /**
         * 清空公告
         */
        try {
            notifyBoard.clearNotifyBoard();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        /**
         * 关闭公告
         */
        try {
            notifyBoard.shutDownNotifyBoard();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
