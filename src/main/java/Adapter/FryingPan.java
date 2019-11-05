package Adapter;

public class FryingPan implements FryingOperation {
    /**
     * @description: 煎锅的煎方法
     * @param: String，int
     * @return null
     */
    @Override
    public void fry(String material, int duration) {
        System.out.println("FryingPan:fry(" + this.toString() + "):" + material + " is being fried");
    }
}
