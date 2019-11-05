package MonoState;

/**
 * 每日特色菜
 */
public class SpecialToday {
    private static String specialDishName;

    /**
     * @description:  SpecialToday的构造函数，初始化为牛肉汉堡
     * @param: null
     * @return null
     */
    SpecialToday() {
        specialDishName = "Beef Hamburger";
    }

    /**
     * @description:  显示每日特色菜
     * @param: null
     * @return null
     */
    public void showSpecialToday() {
        System.out.println("SpecialToday:showSpecialToday(" + this.toString() + "Today's Special：" + specialDishName);
    }

    /**
     * @description:  设置每日特色菜
     * @param: null
     * @return null
     */
    public void setSpecialToday(String dishName) {
        SpecialToday.specialDishName = dishName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException();
    }
}
