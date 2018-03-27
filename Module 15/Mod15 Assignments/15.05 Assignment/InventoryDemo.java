import java.util.*;
/**
 * This is the tester/runner for checking inventory and comparing prices.
 * @author Drew Fisher
 * @version 5/21/16
*/ 
public class InventoryDemo{
    public static void main(String[] args){
        takeInventory("Jigsaw");
        takeInventory("Neon");
        takeInventory("Jaguar");
        takeInventory("RAM");
        takeInventory("Circular Saw");
        
        Tool saw1 = new Tool("Saw", 20.53);
        Tool saw2 = new Tool("Saw", 23.55);
        double diff = saw1.compareTo(saw2);
        if(diff == 0){
            System.out.println("The saws cost the same price.");
        }
        else if(diff < 0){
            System.out.println("The first saw is cheaper");
        }
        else{
            System.out.println("The second saw is cheaper");
        }
    }    
    public static void takeInventory(String in){
        String name = "";
        int quantity = 0;
        double totalCost = 0;
        
        List<Product> products = new ArrayList<Product>();
        products.add(new Car("Jaguar",100000.00));
        products.add(new Car("Neon",17000.00));
        products.add(new Tool("Jigsaw", 149.18));
        products.add(new Car("Jaguar",110000.00));
        products.add(new Car("Neon",17500.00));
        products.add(new Car("Neon",17875.32));
        products.add(new Truck("RAM", 35700.00));
        products.add(new Tool("Circular Saw", 200.00));
        products.add(new Tool("Circular Saw", 150.00));
        
        
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getName().equalsIgnoreCase(in)){
                name = products.get(i).getName();
                quantity++;
                totalCost += products.get(i).getCost();
            }
        }
        if(name == "" && quantity == 0){
            System.out.println("Item "+in+" is not in the inventory.");
        }
        else{
            System.out.println(name+": Quantity = "+quantity+", Total cost = "+totalCost);
        }
    }
}