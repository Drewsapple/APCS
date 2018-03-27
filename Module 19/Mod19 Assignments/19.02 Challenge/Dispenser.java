public class Dispenser{
    private int numberOfItems, cost;
    
    public Dispenser(){
        numberOfItems = 50;
        cost = 50;
    }
    public Dispenser(int numberOfItems, int cost){
        if(numberOfItems >=0 && cost >=0){
            this.numberOfItems = numberOfItems;
            this.cost = cost;
        }
        else{
            String msg = "Cost and number must be positive.";
            throw new IllegalArgumentException(msg);
        }
    }
    
    public int getCount(){
        return numberOfItems;
    }
    public int getProductCost(){
        return cost;
    }
    public void makeSale(){
        numberOfItems--;
    }
}