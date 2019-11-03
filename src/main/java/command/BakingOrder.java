package command;

public class BakingOrder extends Order {

    private Cook cook;

    public BakingOrder(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        this.cook.cook("烤");
    }
}
