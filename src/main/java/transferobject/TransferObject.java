package transferobject;

public class TransferObject {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing TransferObject:");
        System.out.println("===========================");

        PlayerBO playerBusinessObject = new PlayerBO();

        System.out.println("Print All Players:");
        //输出所有的玩家
        for (PlayerVO player : playerBusinessObject.getAllPlayers()) {
            System.out.println("Player: [RollNo : "
                    +player.getRollNo()+", Name : "+player.getName()+" ]");
        }
        //获取玩家0
        PlayerVO player0 = playerBusinessObject.getPlayer(0);
        System.out.println("Get Player0:");
        System.out.println("Player: [RollNo : "
                +player0.getRollNo()+", Name : "+player0.getName()+" ]");

        // 改名后获取玩家0
        player0.setName("Mike");
        System.out.println("Get Player0 After Rename:");
        System.out.println("Player: [RollNo : "
                +player0.getRollNo()+", Name : "+player0.getName()+" ]");

        PlayerVO player1 = playerBusinessObject.getPlayer(1);
        playerBusinessObject.deletePlayer(player1);

        System.out.println("Print All Players:");
        for (PlayerVO player : playerBusinessObject.getAllPlayers()) {
            System.out.println("Player: [RollNo : "
                    +player.getRollNo()+", Name : "+player.getName()+" ]");
        }
    }
}
