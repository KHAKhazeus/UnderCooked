/**
 * @version: V1.0
 * @author: JiangXiaohu
 * @className: NotifyBoard
 * @packageName: ActiveObject
 * @description: 公告牌类，用来展示ActiveObject这一设计模式
 * @data: 2019-11-1
 **/
package ActiveObject;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class NotifyBoard {
    /**
     * 公告牌类与ActiveObject相关的属性
     */
    private String message;
    public static boolean exit = false;
    private BlockingDeque<Runnable> dispatchQueue = new LinkedBlockingDeque<Runnable>();  //任务执行队列


    /**
     * @description: 构造函数,构造一个公告牌实例，并初始化执行队列
     * @param: boolean
     */
    public NotifyBoard(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(!exit){
                    try{
                        dispatchQueue.take().run();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }finally {

                    }
                }
            }
        }).start();
    }

    /**
     * @methodsName: shutDownNotifyBoard
     * @description: 关闭公告牌显示
     * @param:  null
     * @return: void
     */
    void shutDownNotifyBoard()throws InterruptedException{
        dispatchQueue.put(new Runnable() {
            @Override
            public void run() {
                exit = true;
                System.out.println("NotifyBoard:shutDownNotifyBoard:("+this.toString()+"):NotifyBoard has been shut down");
            }
        });
    }

    /**
     * @methodsName: changeNotifyBoard
     * @description: 更改公告牌显示
     * @param:  String
     * @return: void
     */
    void changeNotifyBoard(String notify) throws InterruptedException{
        dispatchQueue.put(new Runnable() {
            @Override
            public void run() {
                message = notify;
                System.out.println("NotifyBoard:changeNotifyBoard:("+this.toString()+"):NotifyBoard says:"+message);
            }
        });
    }

    /**
     * @methodsName: clearNotifyBoard
     * @description: 清空公告牌显示
     * @param:  null
     * @return: void
     */
    void clearNotifyBoard() throws InterruptedException{
        dispatchQueue.put(new Runnable() {
            @Override
            public void run() {
                message="nothing";
                System.out.println("NotifyBoard:clearNotifyBoard:("+this.toString()+"):NotifyBoard says:"+message);
            }
        });
    }

    String getMessage(){
        return message;
    }
}
