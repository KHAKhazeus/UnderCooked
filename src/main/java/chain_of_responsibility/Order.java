package chain_of_responsibility;

public class Order {
    private final int level;

    public Order(int level) {
        this.level = level;
    }

    public int getLevel() {
        return this.level;
    }
}
