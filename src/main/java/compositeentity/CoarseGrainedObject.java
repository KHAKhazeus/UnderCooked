package compositeentity;

public class CoarseGrainedObject {
    private Meat meat;
    private Vegetable vegetable;

    //生成一个粗粒度管理类
    public CoarseGrainedObject() {
        meat = new Meat();
        vegetable = new Vegetable();
    }

    //设置菜品
    public void setDish(String meat, String vegetable) {
        this.meat.setName(meat);
        this.vegetable.setName(vegetable);
    }

    //获取菜品名称
    public String[] getDish() {
        return new String[]{this.meat.getName(), this.vegetable.getName()};
    }
}
