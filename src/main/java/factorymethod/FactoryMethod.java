package factorymethod;

public class FactoryMethod {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing FactoryMethod:");
        System.out.println("===========================");

        MaterialFactory factoryA=new MeatFactory();
        Material pork=factoryA.newMaterial("pork");
        MaterialFactory factoryB=new VegetableFactory();
        Material tomato=factoryB.newMaterial("tomato");
        MaterialFactory factoryC=new RiceFactory();
        Material rice=factoryC.newMaterial("rice");

    }
}
