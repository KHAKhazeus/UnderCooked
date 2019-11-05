package multiton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @title: Pot
 * @package multiton
 * @description: 锅类，用于multiton pattern
 * @author: cyy
 * @date: 2019-11-03 0:04
 * @version: V1.0
*/
public class Pot {
    public static final Logger logger= LogManager.getLogger();

    /**
     * 厨房中锅的列表
     */
    static private Pot listOfPot[] = new Pot[5];

    static {
        for (int i = 0; i < 5; ++i) {
            listOfPot[i] = new Pot(i);
        }
    }

    static public Pot getInstance() {
        /**
         *@title: getInstance
         *@description: 从列表中获取处于空闲状态的锅的实例
         *@author: cyy
         *@date: 2019-11-03 1:14
         *@param: []
         *@return: multiton.Pot
         */

        for (int i = 0; i < 5; ++i) {
            if (listOfPot[i].isUsed == false) {
                logger.info(String.format("(%s): 获得锅%d号",listOfPot[i].toString(),listOfPot[i].id));
                listOfPot[i].isUsed = true;
                return listOfPot[i];
            }
        }
        logger.info("所有锅都在被使用中");
        return null;
    }

    private Pot() {
    }

    private Pot(int i) {
        id = i;
        isUsed = false;
    }


    public void giveBack() {
        /**
         *@title: giveBack
         *@description: 表示归还操作，将Pot对象的状态重新置为可用
         *@author: cyy
         *@date: 2019-11-03 1:15
         *@param: []
         *@return: void
         */

        this.isUsed = false;
        logger.info(String.format("(%s): 已成功归还锅%d号",this.toString(),this.id));
    }

    public Integer id;
    public boolean isUsed;
}
