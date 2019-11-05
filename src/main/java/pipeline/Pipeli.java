package pipeline;

public class Pipeli {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing Pipeline:");
        System.out.println("===========================");

        Pipeline<Potato, RawFries> friesPipeline = new Pipeline<>(new ShavingHandler())
                .addHandler(new CuttingHandler());

        friesPipeline.execute(new Potato());
    }
}
