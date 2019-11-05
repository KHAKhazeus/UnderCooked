package TransferObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:  Player业务对象类，为传输对象填充数据的业务服务。
 * @param: null
 * @return null
 */
public class PlayerBO {
    //列表当作一个数据库
    List<PlayerVO> players;

    /**
     * @description:  PlayerBO构造函数，初始化
     * @param: null
     * @return null
     */
    public PlayerBO(){
        players = new ArrayList<PlayerVO>();
        PlayerVO player1 = new PlayerVO("Amy", 0);
        PlayerVO player2 = new PlayerVO("Bob", 1);
        players.add(player1);
        players.add(player2);
    }
    /**
     * @description:  删除某位玩家
     * @param: PlayerVO
     * @return null
     */
    public void deletePlayer(PlayerVO player) {
        players.remove(player.getRollNo());
        System.out.println("PlayerBO:deletePlayer(" + this.toString() + "):Player" + player.getRollNo() +" left this game");
    }

    /**
     * @description:  显示所有玩家
     * @param: null
     * @return null
     */
    public List<PlayerVO> getAllPlayers() {
        System.out.println("PlayerBO:getAllPlayers(" + this.toString());
        for (PlayerVO player : players) {
            System.out.println("Player: [RollNo : "
                    +player.getRollNo()+", Name : "+player.getName()+" ]");
        }
        return players;
    }
    /**
     * @description:  获取某位玩家
     * @param: int
     * @return PlayerVO
     */
    public PlayerVO getPlayer(int rollNo) {
        return players.get(rollNo);
    }
}
