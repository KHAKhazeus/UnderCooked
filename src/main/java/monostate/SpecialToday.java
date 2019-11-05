package monostate;

// 今日特色菜类
public class SpecialToday {
    private static String specialDishName;

    // 初始化
    SpecialToday() {
        specialDishName = "牛肉汉堡";
    }

    // 展示今日特色菜
    public void showSpecialToday() {
        System.out.println("今日特色菜肴：" + specialDishName );
    }

    // 设置今日特色菜
    public void setSpecialToday(String dishName) {
        SpecialToday.specialDishName = dishName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException();
    }
}
