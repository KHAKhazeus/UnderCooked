package delegation;

public class DelegationTest {
    public static void main(String args[]){
        Bakery bakery = new Bakery();
        bakery.getCake("Black Forest Cake");
        bakery.getCake("Buff Cake");
        bakery.getCake("lalala");
    }
}
