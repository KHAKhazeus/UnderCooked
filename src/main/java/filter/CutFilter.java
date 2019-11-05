package filter;

import java.util.ArrayList;
import java.util.List;

public class CutFilter implements MeatFilter {
    //获取切碎状态信息
    @Override
    public List<Meat> filter(List<Meat> meats) {
        List<Meat> cutMeats=new ArrayList<Meat>();
        meats.forEach(meat -> {
            if (meat.getIsCut()){
                cutMeats.add(meat);
            }
        });
        return cutMeats;
    }
}
