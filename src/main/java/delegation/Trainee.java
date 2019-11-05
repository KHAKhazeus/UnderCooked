package delegation;

public class Trainee implements MakeCake {
    @Override
    public void makeCake(String food) {//Trainee制作蛋糕，输出蛋糕信息
        System.out.println("实习蛋糕师正在制作: "+food);
    }
}
