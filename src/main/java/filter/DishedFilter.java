package filter;

import java.util.ArrayList;
import java.util.List;

public class DishedFilter implements MeatFilter {
    //获取装盘子状态信息
    @Override
    public List<Meat> filter(List<Meat> meats) {
        List<Meat> dishedMeats=new ArrayList<Meat>();
        meats.forEach(meat -> {
            if (meat.getIsDished()){
                dishedMeats.add(meat);
            }
        });
        return dishedMeats;
    }
}
