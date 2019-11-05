package featuretoggle;

import featuretoggle.player.Player;
import featuretoggle.player.PlayerGroup;

public class FeatureTog {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing FeatureToggle:");
        System.out.println("===========================");

        Service service = new FeatureToggle();

        final Player freePlayer = new Player("蔡徐坤");
        final Player vipPlayer = new Player("卢本伟");

        PlayerGroup.addPlayerToFreeGroup(freePlayer);
        PlayerGroup.addPlayerToVipGroup(vipPlayer);

        service.showWelcomeMessage(freePlayer);
        service.showWelcomeMessage(vipPlayer);
    }
}
