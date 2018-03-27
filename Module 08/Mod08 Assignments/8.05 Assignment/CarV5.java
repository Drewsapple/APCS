/**
 * Calculates miles per gallon for a car
 * Author: Drew Fisher
 * Version: 1/6/16
 */
public class CarV5{
    private int startMiles, endMiles;
    private String carType;
    private double gallonsUsed, pricePerGallon;
    CarV5(String type,int eMiles,int sMiles,double gal,double price){
        carType=type;
        endMiles=eMiles;
        startMiles=sMiles;
        gallonsUsed= gal;
        pricePerGallon=price;
    }
    public static int calcDistance(int sMiles, int eMiles){
        return eMiles-sMiles;
    }
    public static double calcMPG(int dist, double gals){
        return dist/gals;
    }
    public double calcGPM(int dist){
        return gallonsUsed/dist;
    }
    public double totalCost(double price){
        return price*gallonsUsed;
    }
    public static void printHeader(){
        System.out.printf("%-15s %-15s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %n","Type of Car","Start Miles","End Miles","Distance","Gallons","Price","Cost","Miles/Gal","Gallons/Mile");
        System.out.printf("%-100.100s %n","---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    public static void printData(String carType, int sMiles, int eMiles, int distance, double gallons,double price, double cost, double mpg, double gpm){
        System.out.printf("%-15s %-15s %-10s %-10s %-10s %-10.2f %-10.2f %-10.2f %-10.2f %n",carType,sMiles,eMiles,distance,gallons,price,cost,mpg,gpm);
    }
    public static void main(String[] args){
        String carType1 = "Honda Odyssey";
        int startMiles1 = 54938;
        int endMiles1 = 55245;
        double gallonsUsed1 = 15.9;
        double pricePerGallon1 = 2.17;
        
        CarV5 car1 = new CarV5(carType1, endMiles1, startMiles1, gallonsUsed1, pricePerGallon1);
        
        int distance1 = car1.calcDistance(startMiles1,endMiles1);
        double cost1 = car1.totalCost(pricePerGallon1);
        double mpg1 = car1.calcMPG(distance1, gallonsUsed1);
        double gpm1 = car1.calcGPM(distance1);
        printHeader();
        printData(carType1,startMiles1,endMiles1,distance1,gallonsUsed1,pricePerGallon1,cost1,mpg1,gpm1);
    }
}