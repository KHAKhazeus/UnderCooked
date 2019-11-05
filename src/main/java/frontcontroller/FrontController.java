package frontcontroller;

// 前端视图类
public class FrontController {

    private PlayerDispatcher playerdispatcher;

    // 构造函数
    public FrontController(){
        playerdispatcher = new PlayerDispatcher();
    }

    // 判断是否为授权用户
    private boolean isAuthenticPlayer(String id){
        if(id.equalsIgnoreCase("Admin")) {
            System.out.println("The Player is authenticated successfully!");
            return true;
        } else {
            System.out.println("The Player is not authenticated!");
            return false;
        }

    }

    // 跟踪请求
    private void trackRequest(String request){
        System.out.println("Page requested: " + request);
    }

    // 记录请求
    public void dispatchRequest(String request, String id){
        //记录每一个请求
        trackRequest(request);
        //对用户进行身份验证
        if(isAuthenticPlayer(id)){
            playerdispatcher.dispatch(request);
        }
    }
}