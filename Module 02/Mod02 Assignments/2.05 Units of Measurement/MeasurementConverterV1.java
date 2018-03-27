/**
 * MeasuermentConverter_v1 converts to and from different
 * units of measure.
 * 
 * @author B. Jordan
 * @version 01/19/07
 *
 * Modified by: Drew Fisher
 * Date: 10/05/15
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        double miles;                       // distance in miles
        double feet;                        // distance in feet
        double feetPerMile = 5280;          //number of feet per 1 mile
        double kilometers;                  // distance in kilometers
        double kilometersPerMile = 1.60934; // number of kilometers per 1 mile
        double pounds;                      // weight in pounds
        double kilograms;                   // weight in kilograms
        double poundsPerKilogram = 2.20462; // number of pounds per 1 kilogram
        double liters;                      // volume in liters
        double gallons;                     // volume in gallons
        double litersPerGallon = 3.78541;   // number of liters in a gallon
        double fathoms;                     // depth in fathoms
        double meters;                      // depth in meters
        double metersPerFathom = 1.8288;    // number of meters in a fathom
        
        //...finish declaring local variables here, including end of line
        //...comments doccumenting purpose of each variable

        System.out.println("This program prints out unit conversions.");
        System.out.println();
        //convert feet to miles
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");


        //convert miles to feet
        miles = 2.1;
        feet = miles*feetPerMile;
        System.out.println(miles + " Miles = " + feet + " feet");

        //convert kilometers to miles
        kilometers = 5;
        miles = kilometers/kilometersPerMile;
        System.out.println(kilometers + " kilometers = " + miles + " Miles");
        
        //convert miles to kilometers
        miles = 10;
        kilometers = miles*kilometersPerMile;
        System.out.println(miles + " Miles = " + kilometers + " kilometers");
        
        //convert pounds to kilograms
        pounds = 37;
        kilograms = pounds/poundsPerKilogram;
        System.out.println(pounds + " pounds = "+kilograms+" kilograms");
        
        //convert kilograms to pounds
        kilograms = 26.3;
        pounds = kilograms*poundsPerKilogram;
        System.out.println(kilograms+" kilograms = "+pounds+" pounds");
        
        //convert liters to gallons
        liters = 2;
        gallons = liters/litersPerGallon;
        System.out.println(liters+" liters = "+gallons+" gallons");
        
        //convert gallons to liters
        gallons = 5;
        liters = gallons*litersPerGallon;
        System.out.println(gallons+" gallons = "+liters+" liters");
        
        //convert meters to fathoms
        meters = 21;
        fathoms = meters/metersPerFathom;
        System.out.println(meters+" meters = "+fathoms+" fathoms");
        
        //convert fathoms to meters
        fathoms = 16;
        meters = fathoms*metersPerFathom;
        System.out.println(fathoms+" fathoms = "+meters+" meters");
    
    }//end of main method
}//end of class
