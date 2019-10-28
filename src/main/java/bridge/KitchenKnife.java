package bridge;


public class KitchenKnife implements Knife {
    private String name;

    public KitchenKnife(String name) {
        this.name = name;
    }

    @Override
    public void cut() {
        System.out.printf("Cutting with kitchen knife: %s.\n", this.name);
    }

    @Override
    public void chop() {
        System.out.printf("Chopping with kitchen knife: %s.\n", this.name);
    }

    @Override
    public void peel() {
        System.out.printf("Peeling with kitchen knife: %s.\n", this.name);
    }
}
