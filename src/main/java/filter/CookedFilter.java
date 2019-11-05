package filter;

import java.util.ArrayList;
import java.util.List;

public class CookedFilter implements MeatFilter {
    //获取烹调状态信息
    @Override
    public List<Meat> filter(List<Meat> meats) {
        List<Meat> cookedMeats = new ArrayList<Meat>();
        meats.forEach(meat -> {
            if (meat.getIsCooked()) {
                cookedMeats.add(meat);
            }
        });
        return cookedMeats;
    }
}
