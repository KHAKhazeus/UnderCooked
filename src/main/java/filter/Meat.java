package filter;

public class Meat {
    private String name;
    private boolean isCut;
    private boolean isCooked;
    private boolean isDished;

    public Meat(String name, boolean isCut, boolean isCooked, boolean isDished) {
        this.name = name;
        this.isCut = isCut;
        this.isCooked = isCooked;
        this.isDished = isDished;
    }

    //获取食材名
    public String getName(){
        return name;
    }
    //获取切碎状态信息
    public boolean getIsCut() {
        return isCut;
    }
    //获取烹调状态信息
    public boolean getIsCooked() {
        return isCooked;
    }
    //获取装盘状态信息
    public boolean getIsDished() {
        return isDished;
    }
}
