public class Item implements Comparable<Item>{
    String itemID, itemName;
    int inStore, sortBy;
    Double price;
    
    public Item(String itemID, String itemName, int inStore, double price){
        this.itemID = itemID;
        this.itemName = itemName;
        this.inStore = inStore;
        this.price = price;
    }
    
    public String toString(){
        return String.format("%-8s %-20s %-8d $%-8.2f",itemID, itemName, inStore, price);
    }
    public String getItemID(){
        return itemID;
    }
    public String getItemName(){
        return itemName;
    }
    public int getInStore(){
        return inStore;
    }
    public double getPrice(){
        return price;
    }
    public int compareTo(Item in){
        int diff = 0;
        if(sortBy == 0){
            diff =  Integer.parseInt(in.getItemID()) - Integer.parseInt(this.getItemID());
        }
        else if(sortBy == 1){
            diff = this.getItemName().compareTo(in.getItemName());
        }
        else if(sortBy == 3){
            diff = Double.valueOf(this.getPrice()).compareTo(Double.valueOf(in.getPrice()));
        }
        return diff;
    }
    public void setSort(int sortBy){
        this.sortBy = sortBy;
    }
    public int getSort(){
        return sortBy;
    }
    
}