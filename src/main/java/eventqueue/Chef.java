package eventqueue;




import java.util.Vector;

/**
 * @title: Chef
 * @package eventqueue
 * @description: 主厨类，继承自厨师类，用于proxy,specification,eventqueue pattern
 * @author: cyy
 * @date: 2019-11-02 23:47
 * @version: V1.0
 */
public class Chef extends Cook {

    public Chef(String name) {
        super(name);
        commis = new Vector<Commis>();
    }

    public Chef(String n, Boolean b, LevelType l, SpecialityType[] s) {
        super(n, b, l, s);

        logger.info(String.format("(%s): 厨师: %s 级别: %s 擅长: %s 忙碌: %b", this.toString(), n, l.getName(), SpecialityType.getSpecialities(s), b));
    }

    private Vector<Commis> commis;

    public void addCommis(Commis c) {
        /**
         *@title: addCommis
         *@description: 将一名助手添加到主厨的助手列表中
         *@author: cyy
         *@date: 2019-11-03 0:48
         *@param: [c]
         *@return: void
         */

        commis.add(c);
        logger.info(String.format("(%s): %s成功找到助手%s", this.toString(), name, c.name));
    }

    private Commis getCommis() {
        /**
         *@title: getCommis
         *@description: 在主厨需要处理一件杂务时随机从助手列表中选择一名助手去处理
         *@author: cyy
         *@date: 2019-11-03 0:49
         *@param: []
         *@return: eventqueue.Commis
         */

        if (commis.isEmpty()) {
            return null;
        }
        int num = (int) (Math.random() * commis.size());
        return commis.get(num);
    }

    @Override
    public void dealChores(String method) {
        /**
         *@title: dealChores
         *@description: 主厨委托一名助手去处理一项杂务，目前只支持两种method, "dish"洗盘子，"ingredient"处理食材
         *@author: cyy
         *@date: 2019-11-03 0:49
         *@param: [method]
         *@return: void
         */

        Commis helper = getCommis();
        if (helper == null) {
            logger.info(String.format("(%s): 无可用助手", this.toString()));
            return;
        }
        logger.info(String.format("(%s): 已选择助手%s", this.toString(), helper.name));
        helper.dealChores(method);
    }
}
