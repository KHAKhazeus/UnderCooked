package delegation;

public class Baker implements MakeCake {
    public void makeCake(String cake){//Baker制作蛋糕，输出所作蛋糕信息
        System.out.println("Baker is making the cake: "+cake);
    }
}
