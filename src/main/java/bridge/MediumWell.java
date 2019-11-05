package bridge;


/**
 * 牛排煎至七分熟
 */
public class MediumWell implements Doneness {
    @Override
    public String fry() {
        return "煎至三分熟";
    }
}
