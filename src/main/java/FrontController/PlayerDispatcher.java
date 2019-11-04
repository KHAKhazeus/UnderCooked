package FrontController;

// PlayerDispatcher类，用于判断应该显示哪个视图
public class PlayerDispatcher {
    private PlayerView playerView;
    private HomeView homeView;

    public PlayerDispatcher(){
        playerView = new PlayerView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("PLAYER")){
            playerView.show();
        }else{
            homeView.show();
        }
    }
}
