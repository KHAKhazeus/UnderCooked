package state;

public class State {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing State:");
        System.out.println("===========================");

        /**
         * 初始化一个鸡肉实例
         */
        Chicken chicken = new Chicken();

        /**
         * 打印一个鸡肉食材创建
         */
        System.out.println("Chicken: Chicken(): ("+chicken.toString()+"): 食材鸡肉被创建");

        /**
         * 打印鸡肉的切、煎之后各个状态变化
         */
        for(int i=0; i<8; ++i){
            if(!chicken.isOverCooked()){
                chicken.cut();
                chicken.fry();
            }
            else{
                break;
            }
        }
        chicken.cut();
        chicken.fry();
    }
}
