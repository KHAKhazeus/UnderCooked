package transferobject;

import java.util.ArrayList;
import java.util.List;

// 业务对象类，为传输对象填充数据的业务服务。

public class PlayerBO {
    //列表当作一个数据库
    List<PlayerVO> players;
    public PlayerBO(){
        players = new ArrayList<PlayerVO>();
        PlayerVO player1 = new PlayerVO("Amy", 0);
        PlayerVO player2 = new PlayerVO("Bob", 1);
        players.add(player1);
        players.add(player2);
    }
    public void deletePlayer(PlayerVO player) {
        players.remove(player.getRollNo());
        System.out.println("Player" + player.getRollNo() +" left this game");
    }
    public List<PlayerVO> getAllPlayers() {
        return players;
    }

    public PlayerVO getPlayer(int rollNo) {
        return players.get(rollNo);
    }
}
