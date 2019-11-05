package adapter;

public class CookingPot implements CookingOperation{
    @Override
    /**
     * @description: 炒锅的炒方法
     * @param: String，int
     * @return void
     */
    public void cook(String material, int duration) {
        if(material.equalsIgnoreCase("鸡蛋")) {
            FryingAdapter fryingAdapter;
            fryingAdapter = new FryingAdapter(material, duration);
            fryingAdapter.cook(material, duration);
        } else {
            System.out.println("CookingPot: cook(" + this.toString() + "):" + material + "正在被炒");
        }
    }
}
