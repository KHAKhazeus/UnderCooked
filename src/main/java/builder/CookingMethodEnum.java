package builder;

public enum CookingMethodEnum {
    STEAM("蒸"),
    STIR_FRY("炒"),
    DEEP_FRY("炸"),
    SHALLOW_FRY("煎"),
    BRAISE("焖"),
    BOIL("煮"),
    ROAST("烤"),
    SIMMER("煨"),
    SMOKE("熏"),
    MARINATE("腌")
    ;

    private String chineseName;

    private CookingMethodEnum(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getChineseName() {
        return chineseName;
    }
}
