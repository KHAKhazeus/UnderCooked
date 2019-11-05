package featuretoggle.player;


import java.util.ArrayList;
import java.util.List;

/**
 * 玩家用户组，包含VIP玩家和免费玩家，只有特定的用户组能访问特定的游戏特性
 */
public class PlayerGroup {
    private static List<Player> freeGroup = new ArrayList<>();
    private static List<Player> vipGroup = new ArrayList<>();

    /**
     * 将玩家添加到免费组中
     * @param player
     * @throws IllegalArgumentException 当用户在vip组中已经存在抛出异常
     */
    public static void addPlayerToFreeGroup(final Player player) throws IllegalArgumentException {
        if (vipGroup.contains(player)) {
            throw new IllegalArgumentException("Player already in the Vip Group.");
        } else {
            if (!freeGroup.contains(player)) {
                freeGroup.add(player);
            }
        }
    }

    /**
     * 将玩家添加到vip组中
     * @param player
     * @throws IllegalArgumentException 当用户在免费组中已经存在抛出异常
     */
    public static void addPlayerToVipGroup(final Player player) throws IllegalArgumentException {
        if (freeGroup.contains(player)) {
            throw new IllegalArgumentException("Player already in the Free Group.");
        } else {
            if (!vipGroup.contains(player)) {
                vipGroup.add(player);
            }
        }
    }

    /**
     * 判断玩家是否是vip玩家
     * @param player
     * @return 若是vip返回true，否则false
     */
    public static boolean isVip(Player player) {
        return vipGroup.contains(player);
    }
}
