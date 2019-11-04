package Adapter;

// 煎锅类
public class FryingPan implements FryingOperation {
    @Override
    public void fry(String material, int duration) {
        System.out.println(material + " is being fried");
    }
}
