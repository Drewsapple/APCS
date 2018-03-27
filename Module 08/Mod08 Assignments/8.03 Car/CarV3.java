/**
 * Calculates miles per gallon for a car
 * Author: Drew Fisher
 * Version: 1/6/16
 */
public class CarV3{
    CarV3(){}
    public static int calcDistance(int sMiles, int eMiles){
        return eMiles-sMiles;
    }
    public static double calcMPG(int dist, double gals){
        return dist/gals;
    }
    public static void printHeader(){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %n","Type of Car","Start Miles","End Miles","Distance","Gallons","Miles/Gal");
        System.out.printf("%-90.90s %n","------------------------------------------------------------------------------------------------------------------");
    }
    public static void printData(String carType, int sMiles, int eMiles, int distance, double gallons, double mpg){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15.2f %n",carType,sMiles,eMiles,distance,gallons,mpg);
    }
    public static void main(String[] args){
        CarV3 car1 = new CarV3();
        String carType1 = "Honda Odyssey 2015";
        int startMiles1 = 54938;
        int endMiles1 = 55245;
        int distance1 = calcDistance(startMiles1,endMiles1);
        double gallons1 = 15.9;
        double mpg1 = calcMPG(distance1, gallons1);
        printHeader();
        printData(carType1,startMiles1,endMiles1,distance1,gallons1,mpg1);
    }
}