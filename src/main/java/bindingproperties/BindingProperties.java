package bindingproperties;

public class BindingProperties {
    public static void test() {

        System.out.println("===========================");
        System.out.println("Testing BindingProperties:");
        System.out.println("===========================");
        /**
         * 初始化两个巧克力蛋糕实例，一个正好在订单中，一个正好不在
         */
        ChocolateCake chocolateCake1 = new ChocolateCake(true);
        ChocolateCake chocolateCake2 = new ChocolateCake(false);


        /**
         * 打印此刻两个巧克力蛋糕的收益
         */
        System.out.println("ChocolateCake: getIncome: ("+chocolateCake1.toString()+"): 因为第一个巧克力蛋糕在订单里, 所以此时第一个巧克力蛋糕的收益为 "
                +Integer.toString(chocolateCake1.getIncome()));
        System.out.println("ChocolateCake: getIncome: ("+chocolateCake2.toString()+"): 因为第二个巧克力蛋糕不在订单里, 所以此时第二个巧克力蛋糕的收益为 "
                +Integer.toString(chocolateCake2.getIncome()));

        /**
         * 调换两个蛋糕是否在订单栏中这一状态
         */
        chocolateCake1.setInOrder(false);
        chocolateCake2.setInOrder(true);

        /**
         * 打印此刻两个巧克力蛋糕的收益
         */
        System.out.println("ChocolateCake: getIncome: ("+chocolateCake1.toString()+"): 因为第一个巧克力蛋糕从订单中取消了, 所以此刻第一个巧克力蛋糕的收益为 "
                +Integer.toString(chocolateCake1.getIncome()));
        System.out.println("ChocolateCake: getIncome: ("+chocolateCake2.toString()+"): 因为第二个巧克力蛋糕加到订单里了, 所以此时第二个巧克力蛋糕的收益为 "
                +Integer.toString(chocolateCake2.getIncome()));
    }
}
