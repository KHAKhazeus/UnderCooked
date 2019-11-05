package compositeentity;

public class Dish {
    private CoarseGrainedObject cgo;

    public Dish() {
        cgo = new CoarseGrainedObject();
    }

    //设置菜品
    public void setDish(String meatName, String vegetableName) {
        this.cgo.setDish(meatName, vegetableName);
    }

    //获取菜品名称
    public String[] getDish() {
        return cgo.getDish();
    }
}
