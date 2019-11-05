package transferobject;

public class TransferObject {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing TransferObject:");
        System.out.println("===========================");

        PlayerBO playerBusinessObject = new PlayerBO();
        //输出所有的玩家
        playerBusinessObject.getAllPlayers();
        //获取玩家0
        PlayerVO player0 = playerBusinessObject.getPlayer(0);
        // 改名后获取玩家0
        player0.setName("王五");
        PlayerVO player1 = playerBusinessObject.getPlayer(1);
        playerBusinessObject.deletePlayer(player1);
        playerBusinessObject.getAllPlayers();
    }
}
