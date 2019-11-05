package transferobject;

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
        PlayerVO player1 = new PlayerVO("张三", 0);
        PlayerVO player2 = new PlayerVO("李四", 1);
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
        System.out.println("PlayerBO: deletePlayer(" + this.toString() + "):玩家" + player.getRollNo() +"离开了游戏");
    }

    /**
     * @description:  显示所有玩家
     * @param: null
     * @return null
     */
    public List<PlayerVO> getAllPlayers() {
        System.out.println("PlayerBO: getAllPlayers(" + this.toString());
        for (PlayerVO player : players) {
            System.out.println("玩家: [序号 : "
                    +player.getRollNo()+", 姓名 : "+player.getName()+" ]");
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
