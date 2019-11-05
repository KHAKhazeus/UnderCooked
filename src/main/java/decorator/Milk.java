package decorator;

public class Milk extends Drink {
    private String description = "牛奶";
    @Override
    public String getDescription() {
        return description;
    }
}
