package filter;

import Utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    public void test() {

        System.out.println("===========================");
        System.out.println("Testing Filter");
        System.out.println("===========================");

        List<Meat> meatList = new ArrayList<Meat>();
        meatList.add(new Meat("鸡肉", false, false, false));
        meatList.add(new Meat("牛肉", true, true, false));
        meatList.add(new Meat("猪肉", true, true, true));

        MeatFilter cut = new CutFilter();
        MeatFilter cooked = new CookedFilter();
        MeatFilter dished = new DishedFilter();

        Utils.logger.info("(" + this.toString() + ") : " + "已切完的食材有：" + cut.filter(meatList));
    }
}
