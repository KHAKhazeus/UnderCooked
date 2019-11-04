package Delegation;

import NullObject.Cake;
import NullObject.ConcreteCake;
import NullObject.NullCake;
import Utils.Utils;

public class Bakery {

    private Baker baker_1 = new Baker();
    private Trainee trainee_1 = new Trainee();


    private void makeCakeByBaker(String cake){
        this.baker_1.makeCake(cake);
    }//正式蛋糕师做蛋糕
    private void makeCakeByTrainee(String cake){
        this.trainee_1.makeCake(cake);
    }//实习蛋糕师做蛋糕

    public Cake getCake(String name){//制作蛋糕返回蛋糕实例
        Utils.logger.info("("+this.toString()+") : ");
        Cake cake;
        switch (name){
            case "Black Forest Cake"://若是黑森林蛋糕则正式蛋糕师制作
                cake = new ConcreteCake(name);
                this.makeCakeByBaker(name);
                cake.serve();
                System.out.println("");
                break;

            case "Buff Cake"://若是奶油蛋糕则实习生做
                cake = new ConcreteCake(name);
                this.makeCakeByTrainee(name);
                cake.serve();
                System.out.println("");

                break;
            default:

                cake = new NullCake();
                cake.serve();
                System.out.println("");
                break;
        }
        return cake;
    }
}
