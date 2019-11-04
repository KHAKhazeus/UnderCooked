package featuretoggle;

import Utils.Utils;
import featuretoggle.player.Player;
import featuretoggle.player.PlayerGroup;
import org.apache.logging.log4j.Logger;


/**
 * 根据玩家所在的不同用户组，提供不同的或额外的功能
 * 下面实现了一个显示欢迎信息的方法作为例子
 */
public class FeatureToggle implements Service {
    private final Logger LOGGER = Utils.logger;

    @Override
    public void showWelcomeMessage(Player player) {
        if (PlayerGroup.isVip(player)) {
//            LOGGER.info("(" + this.toString() + ") : " +  String.format("睾贵的心悦会员 %s 您好，欢迎来到UnderCooked!", player.getName()));
        } else {
//            LOGGER.info("(" + this.toString() + ") : " +  String.format("%s，没钱玩你妈逼！", player.getName()));
        }
    }
}
