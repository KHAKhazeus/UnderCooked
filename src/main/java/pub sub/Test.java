import java.util.concurrent.FutureTask;

public class Test {

    public static void main(String[] args) {
        Cooks cook1 = new Cooks("厨师1·");
        Cooks cook2 = new Cooks("厨师2");
        Cooks cook3 = new Cooks("厨师3");
        Cooks cook4 = new Cooks("厨师4");

        Generators gen1 = new Generators("gen apple");
        Generators gen2 = new Generators("gen pear");

        gen1.addCook(cook1);
        gen1.addCook(cook2);
        gen1.addCook(cook3);
        gen1.addCook(cook4);

        gen2.addCook(cook1);
        gen2.addCook(cook2);
        gen2.addCook(cook3);
        gen2.addCook(cook4);

        gen1.start();
        FutureTask<String> ft = new FutureTask<>(gen2);
        new Thread(ft).start();
        // send
        // gen1.notifyAllCook("apple");
        // gen2.notifyAllCook("pear");

        // try {
        // System.out.println("子线程的返回值：" + ft.get());
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // } catch (ExecutionException e) {
        // e.printStackTrace();
        // }
        // gen2.start();

        // delete
        // gen1.deleteCook(cook1);
        // System.out.println("---------------------");
        // gen1.notifyAllCook("pear");
    }
}
