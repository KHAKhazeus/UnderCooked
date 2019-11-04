package Adapter;

// 适配器，可以让炒锅进行煎方法
public class FryingAdapter implements CookingOperation{

    public FryingAdapter(String material, int duration){
        System.out.println(material + " is using frying adapter");
    }
    @Override
    public void cook(String material, int duration) {
        FryingPan fryingPan = new FryingPan();
        fryingPan.fry(material, duration);
    }
}
