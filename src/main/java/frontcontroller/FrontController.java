package frontcontroller;

/**
 * 前端视图类
 */
public class FrontController {

    private PlayerDispatcher playerdispatcher;

    /**
     * @description: 视图类的构造函数
     */
    public FrontController(){
        playerdispatcher = new PlayerDispatcher();
    }

    /**
     * @description: 判断是否为授权用户
     * @param: String
     * @return Boolean
     */
    private boolean isAuthenticPlayer(String id){
        if(id.equalsIgnoreCase("管理员")) {
            System.out.println("FrontController: isAuthenticPlayer(" + this.toString() + "):该用户被认证成功");
            return true;
        } else {
            System.out.println("FrontController: isAuthenticPlayer(" + this.toString() + "):该用户认证不成功");
            return false;
        }

    }
    /**
     * @description: 跟踪请求
     * @param: String
     * @return null
     */
    private void trackRequest(String request){
        System.out.println("FrontController: trackRequest(" + this.toString() + "):页面请求：" + request);
    }

    /**
     * @description: 记录请求
     * @param: String，String
     * @return null
     */
    public void dispatchRequest(String request, String id){
        //记录每一个请求
        trackRequest(request);
        //对用户进行身份验证
        if(isAuthenticPlayer(id)){
            playerdispatcher.dispatch(request);
        }
    }
}