package FrontController;

/**
 * PlayerDispatcher类，用于判断应该显示哪个视图
 */
public class PlayerDispatcher {
    private PlayerView playerView;
    private HomeView homeView;
    /**
     * @description: PlayerDispatcher的构造函数，初始化两个视图
     * @param: null
     * @return null
     */
    public PlayerDispatcher(){
        playerView = new PlayerView();
        homeView = new HomeView();
    }

    /**
     * @description: 通过request判断分发相应视图并显示
     * @param: String
     * @return null
     */
    public void dispatch(String request){
        if(request.equalsIgnoreCase("PLAYER")){
            playerView.show();
        }else{
            homeView.show();
        }
    }
}
