package Adapter;

public class FryingAdapter implements CookingOperation {

    public FryingAdapter(String material, int duration){
        System.out.println("FryingAdapter:FryingAdapter(" + this.toString() + "):" + material + " is using frying adapter");
    }
    /**
     * @description: 适配器的炒方法
     * @param: String，int
     * @return null
     */
    @Override
    public void cook(String material, int duration) {
        FryingPan fryingPan = new FryingPan();
        fryingPan.fry(material, duration);
    }
}
