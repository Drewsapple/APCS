 import java.util.Scanner;
/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current
 * exchange rate by a user.
 *
 *
 * ©CSA/FLVS 2011
 * @author Maria Vieta Jacquard
 * @version 09/01/11
 * 
 * @modified by Drew Fisher
 * @date: 10/22/15
 */
public class CurrencyConversionV2
{
    public static void main(String [ ] args)
    {
        
        // purpose of program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        
        Scanner in = new Scanner(System.in);
        double startingUsDollars = 5000.00;		    // local variable for US Dollars
        double pesosSpent = 7210.25;                // local variable for Mexican pesos spent
        System.out.println("What is the current exchange rate of US Dollars to Pesos?");
        double pesoExchangeRage = in.nextDouble();     
        double dollarsSpentInMexico = 0.0;          // local variable for dollars spent in Mexico
        double remainingUsDollars = startingUsDollars;        // local variable for US Dollars remaining
        
        //remaining variables below here
        double yenSpent = 99939.75;                 // local variable for Japanese yen spent
        double dollarsSpentInJapan = 0.0;           // local variable for dollars spent in Japan
        System.out.println("What is the current exchange rate of US Dollars to Japanese Yen?");
        double yenExchangeRate = in.nextDouble();   
        
        double eurosSpent = 624.95;                 // local variable for euros spent
        double dollarsSpentInFrance = 0.0;          // local variable for dollars spent in france
        System.out.println("What is the current exchange rate of US Dollars to Euros?");
        double euroExchangeRate = in.nextDouble();
        

        // convertion for Mexican pesos
        // code goes below here
        dollarsSpentInMexico = pesosSpent/pesoExchangeRage;
        remainingUsDollars -= dollarsSpentInMexico;

        // convertion for Japanese yen
        // code goes below here
        dollarsSpentInJapan = yenSpent/yenExchangeRate;
        remainingUsDollars -= dollarsSpentInJapan;

        // convertion for Euros
        // code goes below here
        dollarsSpentInFrance = eurosSpent/euroExchangeRate;
        remainingUsDollars -= dollarsSpentInFrance;

        //print output to the screen
        // code goes below here
        System.out.println("Starting US Dollars: "+startingUsDollars);
        System.out.println("US Dollars Spent In Mexico: "+dollarsSpentInMexico);
        System.out.println("US Dollars Spent In Japan: "+dollarsSpentInJapan);
        System.out.println("US Dollars Spent In France: "+dollarsSpentInFrance);
        System.out.println("======================================");
        System.out.println("US Dollars Remaining: "+remainingUsDollars);
        
        // Complete the code below. Replace the 0's for totalItem and fundsRemaining
        // with the proper calculations. Casting, integer division and the modulus
        // operator needed. Do not worry about extra decimal places for the dollar amounts.

 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 4;  						//cost per item of first souvenir
		int budget1 = 50;   						//budget for first item
		int totalItem1 = budget1/costItem1; 		//how many items can be purchased
		double fundsRemaining1 = (double)budget1%costItem1;  //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItem1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);

		//Calculations for Souvenir #2
		double costItem2 = 32.55;  						//cost per item of second souvenir
		int budget2 = 713;   							//budget for second item
		int totalItem2 = (int)(budget2/costItem2); 	//how many items can be purchased
		double fundsRemaining2 = (double)budget2%costItem2;  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItem2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class
