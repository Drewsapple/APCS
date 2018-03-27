/**
 * Displays statistics about fuel consumption
 * @author Drew Fisher
 * @version 1/27/16
 */ 
public class AnnualFuelUse{
    private int fillDay, fillNum, startMiles, endMiles, dist;
    private double gallonsUsed, pricePerGallon, cost, mpg, gpm;
    
    AnnualFuelUse(int fNum,int fDay,int eMiles,int sMiles,double gal,double price){
        fillNum=fNum;
        fillDay=fDay;
        endMiles=eMiles;
        startMiles=sMiles;
        gallonsUsed= gal;
        pricePerGallon=price;
    }
    public int calcDistance(){
        dist = endMiles-startMiles;
        return dist;
    }
    public double calcMPG(){
        mpg = dist/gallonsUsed;
        return mpg;
    }
    public double calcGPM(){
        gpm = gallonsUsed/dist;
        return gpm;
    }
    public double totalCost(){
        cost = pricePerGallon*gallonsUsed;
        return cost;
    }
    public double price(){
        return pricePerGallon;
    }
    public int getDays(){
        return fillDay;
    }
    public double getGallons(){
        return gallonsUsed;
    }
    public void printData(){
        System.out.printf("%-15s %-15s %-15s %-10s %-10s %-10s %-10.2f %-10.2f %-10.2f %-10.3f %n",fillNum,fillDay,startMiles,endMiles,dist,gallonsUsed,pricePerGallon,cost,mpg,gpm);
    }
}