package publishsubscribe;
// Cook 接口的实现

public class Cooks implements Cook {
    private String name;

    Cooks(String name) {
        this.name = name;
    }

    @Override
    public void UpdateMsg(String msg) {
        if (!"".equals(msg)) {
            System.out.println("Cooks:UpdateMsg:("+ this.toString()+"):" + name + ": get " + msg);
        }
    }
}
