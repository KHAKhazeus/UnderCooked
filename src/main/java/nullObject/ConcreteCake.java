package nullObject;

public class ConcreteCake implements Cake {
    private String name;

    public ConcreteCake(String name){
        this.name = name;
    }

    @Override
    public void serve() {
        System.out.println(name+" 正在上菜!");
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
