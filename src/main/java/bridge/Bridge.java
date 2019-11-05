package bridge;

public class Bridge {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing Bridge:");
        System.out.println("===========================");

        Steak mediumWellSirloin = new SirloinSteak(new MediumWell());
        Steak mediumRareFilet = new FiletSteak(new MediumRare());

        mediumWellSirloin.cook();
        mediumRareFilet.cook();
    }
}
