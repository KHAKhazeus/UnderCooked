package nullObject;

public class ConcreteCake implements Cake {
    private String name;

    public ConcreteCake(String name){
        this.name = name;
    }

    @Override
    public void serve() {
        System.out.println(name+" is coming!");
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
