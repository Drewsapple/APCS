public class Tool implements Product, Comparable<Tool>{
    String name;
    double cost;
    public Tool(String n, double c){
        name = n;
        cost = c;
    }
    public String getName(){
        return name;
    }
    public double getCost(){
        return cost;
    }
    public int compareTo(Tool in){
    	if(cost == in.getCost()){
    		return 0;
    	}
    	else if(cost < in.getCost()){
    		return -1;
    	}
    	else{
    		return 1;
    	}
    }
}