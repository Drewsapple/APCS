public abstract class Vehicle implements Product{
    String name;
    double cost;
    public Vehicle(String n, double c){
        name = n;
        cost = c;
    }
    public String getName(){
        return name;
    }
    public double getCost(){
        return cost;
    }
}