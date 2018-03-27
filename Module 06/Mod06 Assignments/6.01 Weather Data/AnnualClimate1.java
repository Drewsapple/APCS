/**
 * Display climate info cleanly
 *
 * @author Drew Fisher
 * @version 11/24/15
 *
 */

import java.util.Scanner;
class AnnualClimate1
{

   	public static void main (String [ ] args)
	{

		//Declare and intialize variables
		Scanner in = new Scanner(System.in);
		String city = "Miami,";
		String state = "FL";

		String month [] ={"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" };
		double temperature [] ={68.1, 69.1, 72.4, 75.7, 79.6, 82.4, 83.7, 83.6, 82.4, 78.8, 74.4, 69.9}; 		//initialize with Fahrenheit values
		double precipitation [] ={1.9, 2.1, 2.6, 3.4, 5.5, 8.5, 5.8, 8.6, 8.4, 6.2, 3.4, 2.2}; 	//initialize with inch values
		double totalTemp = 0.0;
		double totalPrecip = 0.0;
		double averageTemp = 0.0;
		String tempLabel = "F";   //initialize to F
		String precipLabel = "in"; //initialize to in


		//INPUT - ask user for temp and precipitation scale choice
		System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
		String tempChoice = in.next();
		System.out.print("Choose the precipitation scale (i = inches, c = centimeteres): ");
		String precipChoice = in.next();


		//PROCESSING - convert from F to C and in to cm based on user's choices
		// remember 5/9 = 0, 5.0/9 = .5555

		if(tempChoice.equalsIgnoreCase("C")){
			tempLabel="(C)";
			for( int index = 0; index < temperature.length; index++)
			{
				//code for assigning new C values to the temperature array
				temperature [index] = ((temperature [index])-32)*(5.0/9);
				totalTemp += temperature [index];
			}
		}
		else if(tempChoice.equalsIgnoreCase("F")){
			tempLabel="(F)";
			for( int index = 0; index < temperature.length; index++)
			{
				//code for assigning new C values to the temperature array
				totalTemp += temperature [index];
			}
		}
		else{}
		averageTemp = totalTemp/temperature.length;

		//Convert in values to cm; replace the current values in precipitation
		if(precipChoice.equalsIgnoreCase("c")){
			precipLabel="(cm)";
            for(int index2 = 0; index2 < precipitation.length; index2++){
                precipitation [index2] = (precipitation [index2])*(2.54);
                totalPrecip += precipitation [index2];
            }
		}
		else if(precipChoice.equalsIgnoreCase("i")){
			precipLabel="(in)";
            for(int index2 = 0; index2 < precipitation.length; index2++){
                totalPrecip += precipitation [index2];
            }
		}
		else{}
		
		//OUTPUT - print table using printf to format

		System.out.println();
		System.out.printf("%30s %n","Climate Data");
		System.out.printf("%20.10s %10.10s %2.2s %n","Location: ",city,state);
		System.out.printf("%5s %18s %s %18s %s","Month","Temperature",tempLabel,"Precipitation",precipLabel);
		System.out.println();
		System.out.printf("***************************************************\n");
		for(int index3 = 0;index3 < month.length;index3++){
		    System.out.printf("%5.3s %16.4s %21.4s",month[index3],temperature [index3],precipitation [index3]);
		    System.out.println();
		}
		System.out.printf("***************************************************\n");
		System.out.printf("%7s %9s %-5.4s %15.8s %5.5s %n","","Average: ",averageTemp,"Annual: ",totalPrecip);



	}//end main
}//end Annual Climate