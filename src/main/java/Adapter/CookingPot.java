package Adapter;

public class CookingPot implements CookingOperation {
    @Override
    /**
     * @description: 炒锅的炒方法
     * @param: String，int
     * @return void
     */
    public void cook(String material, int duration) {
        if(material.equalsIgnoreCase("Egg")) {
            FryingAdapter fryingAdapter;
            fryingAdapter = new FryingAdapter(material, duration);
            fryingAdapter.cook(material, duration);
        } else {
            System.out.println("CookingPot:cook(" + this.toString() + "):" + material + " is being cooked");
        }
    }
}
