/**
 * Calculates miles per gallon for a car, Now with less parameters!
 * @author Drew Fisher
 * @version 4/27/16
 */
public class CarV7New{
    private int startMiles, endMiles;
    private String carType;
    private double gallonsUsed, pricePerGallon, distance, mpg, gpm, cost;
    
    CarV7New(String type,int eMiles,int sMiles,double gal,double price){
        carType=type;
        endMiles=eMiles;
        startMiles=sMiles;
        gallonsUsed= gal;
        pricePerGallon=price;
    }
    public void calcDistance(){
        this.distance = this.endMiles-this.startMiles;
    }
    public void calcMPG(){
        this.mpg = this.distance/this.gallonsUsed;
    }
    public void calcGPM(){
        this.gpm = this.gallonsUsed/this.distance;
    }
    public void totalCost(){
        this.cost = this.pricePerGallon*this.gallonsUsed;
    }
    public static void printHeader(){
        System.out.printf("%-15s %-15s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %n","Type of Car","Start Miles","End Miles","Distance","Gallons","Price","Cost","Miles/Gal","Gallons/Mile");
        System.out.printf("%-100.100s %n","---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    public void printData(){
        System.out.printf("%-15s %-15s %-10s %-10s %-10s %-10.2f %-10.2f %-10.2f %-10.2f %n",this.carType,this.startMiles,this.endMiles,this.distance,this.gallonsUsed,this.pricePerGallon,this.cost,this.mpg,this.gpm);
    }
}