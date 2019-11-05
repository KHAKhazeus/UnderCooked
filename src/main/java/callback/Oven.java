package callback;


public class Oven {
    public void start(int time,Button button){
        if(button.getState()){
            return;
        }
        System.out.println("开始烘焙...");

        countDown(time);

        button.callback();
    }
    private void countDown(int time){

        while (time>0) {
            System.out.println(time+"s");

            try {
                Thread.sleep(1000);
                time--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
