package eventqueue;

/**
 * @title: eventqueue
 * @package proxy
 * @description: 助手类，继承自厨师类，用于proxy pattern
 * @author: cyy
 * @date: 2019-11-02 23:48
 * @version: V1.0
 */
public class Commis extends Cook {
    public Commis(String name) {
        super(name);
    }

    @Override
    public void dealChores(String method) {
        /**
         *@title: dealChores
         *@description: 助手具体实现杂务，目前只支持洗盘子与处理食材
         *@author: cyy
         *@date: 2019-11-03 0:50
         *@param: [method]
         *@return: void
         */

        if (method == "dish") {
            wishDishes();
        } else if (method == "ingredient") {
            handleIngredients();
        } else {
            logger.info(String.format("(%s): 非合法指令", this.toString()));
        }
    }

    private void wishDishes() {
        /**
         *@title: wishDishes
         *@description: 助手洗盘子
         *@author: cyy
         *@date: 2019-11-03 0:50
         *@param: []
         *@return: void
         */

        logger.info(String.format("(%s): %s正在洗盘子", this.toString(), name));
    }

    //proxy: 助手处理食材
    private void handleIngredients() {
        /**
         *@title: handleIngredients
         *@description: 助手处理食材
         *@author: cyy
         *@date: 2019-11-03 0:50
         *@param: []
         *@return: void
         */

        logger.info(String.format("(%s): %s正在处理食材", this.toString(), name));
    }
}
