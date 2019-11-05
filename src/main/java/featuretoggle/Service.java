package featuretoggle;

import featuretoggle.player.Player;

/**
 * 给玩家提供的各种服务
 */
public interface Service {
    /**
     * 为玩家生成欢迎信息
     * @param player 要生成欢迎信息的玩家
     * @return 返回欢迎信息
     */
    void showWelcomeMessage(Player player);
}
