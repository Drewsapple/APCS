/**
 * @purpose: Calculate yearly CO2 emissions from electricity (8.10)
 *
 * @author: Drew Fisher
 * @version: 2/2/16
 */
import java.util.ArrayList;
public class CO2FromElectricity{
   CO2FromElectricity(){
   	//default constructor to be used
   }

   public double calcAverageBill(ArrayList<Double> monthlyBill){
       double billTotal = 0;
       for(int i=0;i<monthlyBill.size();i++){
           billTotal += monthlyBill.get(i);
       }
       double billAvg = billTotal/(double)monthlyBill.size();
       return billAvg;
   }

   public double calcAveragePrice(ArrayList<Double> monthlyPrice){
       double priceTotal = 0;
       for(int i=0;i<monthlyPrice.size();i++){
           priceTotal += monthlyPrice.get(i);
       }
       double priceAvg = priceTotal/(double)monthlyPrice.size();
       return priceAvg;
   }

   public double calcElectricityCO2 (double avgBill, double avgPrice){
        double yearlyEmissions = (avgBill/avgPrice)*1.37*12;
        return yearlyEmissions;
   }
}
