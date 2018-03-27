/**
 * This project converts units
 * 
 * @author Drew Fisher 
 * @version 12/7/15
 */
public class MeasurementConverterV2
{
//Purpose of program
    public static void printPurpose( )  //notice that this method is void, nothing is returned
    {
        System.out.println("This program converts to and from");
        System.out.println("Different units of measure.");
        System.out.println("=====================================");
    }
        
    //convert feet to miles
    //the ft parameter receives the value of the feet argument passed from main method. 
    public static double convertFeetToMiles(double ft)
    {
        return ft / 5280;      
    } 
    
    //convert miles to feet
    public static double convertMilesToFeet(double mi)
    {
        return mi * 5280;      
    } 
    
    //convert miles to kilometers
    public static double convertMilesToKilometers(double mi)
    {
        return mi / 0.621371;     
    }
    
    //convert kilometers to miles
    public static double convertKilometersToMiles(double km)
    {
        return km * 0.621371;    
    } 
    
    //convert pounds to kilograms
    public static double convertPoundsToKilograms(double lbs)
    {
        return lbs / 0.453592;   
    } 
    
    //convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms)
    {
        return kilograms * 0.453592;     
    } 
    
    //convert gallons to liters
    public static double convertGallonsToLiters(double gallons)
    {
        return gallons * 3.78541;
    }
    
    //convert liters to gallons
    public static double convertLitersToGallons(double liters)
    {
        return liters / 3.78541;
    }
    
    //convert joules to kilocalories
    public static double convertJoulesToKilocalories(double joules)
    {
        return joules / 4184;
    }
    
    //convert kilocalories to joules
    public static double convertKilocaloriesToJoules(double kilocalories)
    {
        return kilocalories * 4184;
    }
    
    public static void main(String[ ] args)
    {
        //local variables
        double miles, feet, kilometers, pounds, kilograms, gallons, liters, joules, kilocalories;
        
    
        printPurpose();                                    //invoke the printPurpose() method
        feet = 6230;
        miles = convertFeetToMiles(feet);            //invoke the convertFeetToMiles() static method and pass the feet variable as an argument
        System.out.printf("%8.1f ft. = %7.1f mi. %n", feet, miles);
        
        miles = 1.9;
        feet = convertMilesToFeet(miles);
        System.out.printf("%8.1f mi. = %7.1f ft. %n", miles, feet);
        
        miles = 22.3;
        kilometers = convertMilesToKilometers(miles);
        System.out.printf("%8.1f mi. = %7.1f km. %n", miles, kilometers);
        
        kilometers = 1000.0;
        miles = convertKilometersToMiles(kilometers);
        System.out.printf("%8.1f km. = %7.1f mi. %n", kilometers, miles);
        
        pounds = 204;
        kilograms = convertPoundsToKilograms(pounds);
        System.out.printf("%8.1f lb. = %7.1f kg. %n", pounds, kilograms);
       
        kilograms = 73.5;
        pounds = convertKilogramsToPounds(kilograms);
        System.out.printf("%8.1f kg. = %7.1f lb. %n", kilograms, pounds);
        
        gallons = 70;
        liters = convertGallonsToLiters(gallons);
        System.out.printf("%8.1f gl. = %7.1f li. %n", gallons, liters);
        
        liters = 93.6;
        gallons = convertLitersToGallons(liters);
        System.out.printf("%8.1f li. = %7.1f gl. %n", liters, gallons);
        
        joules = 7028.3;
        kilocalories = convertJoulesToKilocalories(joules);
        System.out.printf("%8.1f jl. = %7.1f kc. %n", joules, kilocalories);
        
        kilocalories = 402.5;
        joules = convertKilocaloriesToJoules(kilocalories);
        System.out.printf("%8.1f kc. = %7.1f jl. %n", kilocalories, joules);
    }//end of main method
	
}//end of class