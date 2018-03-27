/**
 * Displays statistics about fuel consumption
 * @author Drew Fisher
 * @version 1/27/16
 */ 
public class AnnualFuelUseTester{
    public static void main(String[] args){
        int distMin = Integer.MAX_VALUE, distMax = Integer.MIN_VALUE, dist, distTotal = 0, yearDist;
        double mpgMin = Double.MAX_VALUE, mpgMax = Double.MIN_VALUE, mpg, mpgTotal = 0,
                priceMin = Double.MAX_VALUE, priceMax = Double.MIN_VALUE, price, priceTotal = 0, 
                cost, gpm, yearGals, yearMPG, yearCost, gals, galTotal = 0, costTotal = 0;
        AnnualFuelUse[] fillUps =  {new AnnualFuelUse(1, 1, 55245, 54938, 15.9, 2.17),
                                    new AnnualFuelUse(2, 7, 55602, 55245, 14.3, 2.09),
                                    new AnnualFuelUse(3,13,55943,55602,15.2,1.98)
                                    };
        System.out.printf("%-15s %-15s %-15s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %n","Fill Up #","Fill Up Day","Start Miles","End Miles","Distance","Gallons","Price","Cost","Miles/Gal","Gallons/Mile");
        System.out.printf("%-120.120s %n","---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        for(int index = 0;index < fillUps.length;index++){
            dist = fillUps[index].calcDistance();
            distTotal += dist;
            if(dist < distMin){
                distMin = dist;
            }
            if(dist > distMax){
                distMax = dist;
            }
            mpg = fillUps[index].calcMPG();
            mpgTotal += mpg;
            if(mpg > mpgMax){
                mpgMax = mpg;
            }
            if(mpg < mpgMin){
                mpgMin = mpg;
            }
            price = fillUps[index].price();
            priceTotal += price;
            if(price > priceMax){
                priceMax = price;
            }
            if(price < priceMin){
                priceMin = price;
            }
            gpm = fillUps[index].calcGPM();
            cost = fillUps[index].totalCost();
            costTotal += cost;
            gals = fillUps[index].getGallons();
            galTotal += gals;
            fillUps[index].printData();
        }
        yearDist = (distTotal/fillUps[fillUps.length-1].getDays())*365;
        yearGals = (galTotal/fillUps[fillUps.length-1].getDays())*365;
        yearMPG  = (mpgTotal/fillUps.length);
        yearCost = (costTotal/fillUps[fillUps.length-1].getDays())*365;
    
        System.out.println();
        System.out.printf("%-15s %-15s %-15s %-10s %-10s %-10s %-10.2f %-10s %-10.2f %-10s %n","Minimum:","","","",distMin,"",priceMin,"",mpgMin,"");
        System.out.printf("%-15s %-15s %-15s %-10s %-10s %-10s %-10.2f %-10s %-10.2f %-10s %n","Maxium:","","","",distMax,"",priceMax,"",mpgMax,"");
        System.out.println();
        System.out.printf("%-15s %-15s %-15s %-10s %-10s %-10.2f %-10s %-10.2f %-10s %-10s %n", "Totals:","","","",distTotal,galTotal,"",costTotal,"","");
        System.out.printf("%-16s %-14s %-15s %-10s %-10s %-10.2f %-10s %-10.2f %-10.2f %-10s %n", "Year Projection:","","","",yearDist,yearGals,"",yearCost,yearMPG,"");
    }
}