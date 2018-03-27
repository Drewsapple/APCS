/**
 * This is the tester for the candy machine that can throw errors
 * @author Drew Fisher
 * @version 6/11/16
*/
public class CandyMachine{
    public static void main(String[] args){
        Dispenser d = new Dispenser(10, 25);
        CashRegister c = new CashRegister(10);
        sellProduct(d,c,65);
    }
    public static void sellProduct(Dispenser d, CashRegister c, int coins){
        if(coins >= d.getProductCost()){
            if(d.getCount()>0){
                d.makeSale();
                c.acceptAmount(d.getProductCost());
                int change = coins - d.getProductCost();
                System.out.println("Collect your item at the bottom and enjoy. Your change is "+change+" coins.");
            }
            else{
                System.out.println("None left!");
            }
        }
        else{
            System.out.println("You don't have enough money.");
        }
    }
}