package Adapter;

// 炒锅类，实现炒方法的接口cook
public class CookingPot implements CookingOperation {
    @Override
    public void cook(String material, int duration) {
        if(material.equalsIgnoreCase("Egg")) {
            FryingAdapter fryingAdapter;
            fryingAdapter = new FryingAdapter(material, duration);
            fryingAdapter.cook(material, duration);
        } else {
            System.out.println(material + " is being cooked");
        }
    }
}
