public class CashRegister{
    private int cashOnHand;
    
    public CashRegister(){
        cashOnHand = 500;
    }
    public CashRegister(int cashOnHand){
        if(cashOnHand >= 0){
            this.cashOnHand = cashOnHand;
        }
        else{
            String msg = "You cannot have negative money.";
            throw new IllegalArgumentException(msg);
        }
    }
    public void acceptAmount(int addedMoney){
        if(addedMoney >= 0){
            cashOnHand += addedMoney;
        }
        else{   
            String msg="You cannot add a negative ammount.";
            throw new IllegalArgumentException(msg);
        }
    }
}