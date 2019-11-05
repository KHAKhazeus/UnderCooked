package bridge;


/**
 * 牛排煎至五分熟
 */
public class MediumRare implements Doneness {

    @Override
    public String fry() {
        return "煎至五分熟";
    }
}
