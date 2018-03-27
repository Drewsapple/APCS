/**
 * Cleanly displays heat indexes, temperatures and humidities.
 *
 * @author Drew Fisher
 * @version 11/24/15
 *
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class HeatIndex
{
    public static void main(String[] args) throws IOException
    {
    	//initialize and declare variables

        String location = "Key West, FL";
        File fileNameTemp = new File("KeyWestTemp.txt");
        File fileNameHumid = new File("KeyWestHumid.txt");
        File output = new File("HeatIndexResult.txt");

        Scanner inFileTemp = new Scanner(fileNameTemp);
        Scanner inFileHumid = new Scanner(fileNameHumid);

        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novermber", "December"};
        int length = month.length;
        double [] temperature = new double[length];
        int [] humidity = new int[length];
        double [] hI = new double[length];


		//INPUT - read in data for temp and humidity from files

		int n = 0; //index value for arrays
        while( inFileTemp.hasNextDouble() )
        {
            temperature[n] = inFileTemp.nextDouble( );
            //System.out.println (temperature[n]); //debug statement - uncomment to see values assignned to temperature
            n++;
        }
        inFileTemp.close();


        n = 0; //reset index to 0
        while (inFileHumid.hasNextDouble())
        {
                humidity[n] = inFileHumid.nextInt( );
                //System.out.println (humidity[n]);  //debug statement - uncomment to see values assignned to humidity
                n++;
        }
        inFileHumid.close();

		//PROCESSING - calculate Heat Index if needed- see lecture notes for details, formula is incomplete

		double t = 0.0;
		int h = 0;

        for(n = 0; n < hI.length; n++)
        {
            if( temperature[n] >= 80.0  && humidity[n] >= 40.0) //determine if HI should be calculated, complete the condition based on Lecture notes
            {
            	t = temperature[n];
            	h = humidity[n];

                hI[n] = (double)((int)(10*(-42.379 + (2.04901523*t) + (10.14333127*h) - (0.22475541*t*h) - (6.83783*Math.pow(10, -3)*Math.pow(t,2)) - (5.481717*Math.pow(10,-2)*Math.pow(h,2)) + (1.22874*Math.pow(10,-3)*Math.pow(t,2)*h) + (8.5282*Math.pow(10,-4)*t*Math.pow(h,2)) - (1.99*Math.pow(10,-6)*Math.pow(t,2)*Math.pow(h,2)))))/10; 	//complete formula found in lecture notes
            }
            else  // HI is the temperature value
            {
                hI[n] = temperature[n];
            }
        }


        //calculate averages for temperature, humidity and HI, and your mom

        double tempSum = 0.0;
        double humidSum = 0.0;
        double hISum = 0.0;
        
        //temperature
        for(Double localT : temperature){
        	tempSum += localT;
        }
        double tempAvg = tempSum/temperature.length;
        
        //humidity
        for(Integer localH : humidity){
        	humidSum += localH;
        }
        double humidAvg = humidSum/humidity.length;
        
        //hI
        for(Double localHI : hI){
        	hISum += localHI;
        }
        double hIAvg = hISum/hI.length;
        
        
        //OUTPUT to file - print table. Use enhanced for loops to print the months, temp, humidity and HI
        
        PrintWriter writeOut = new PrintWriter(output);
        writeOut.printf("%-13s %s %n","Heat Index:",location);
        writeOut.printf("%20s %n","Months");
        writeOut.print("              ");
        for(String m : month)
        {
            writeOut.printf("%-7.3s", m);
        }


        writeOut.println("Avg");
        writeOut.println("******************************************************************************************************");

        //Temperature
        writeOut.printf("%-14s","Temp(F)");
        for(Double localT: temperature){
            writeOut.printf("%-7.4s",localT);
        }
        
		//print average
        writeOut.printf("%-7.4s %n",tempAvg);

        //Humidity
        writeOut.printf("%-14s","Humidity(%)");
        for(Integer localH: humidity){
            writeOut.printf("%-7.4s",localH);
        }
        //print average
        writeOut.printf("%-7.4s %n",humidAvg);

        //Heat Intensity
        writeOut.printf("%-14s","HI(F)");
        for(Double localHI: hI){
            writeOut.printf("%-7.4s",localHI);
        }
        //print average
        writeOut.printf("%-7.4s %n",hIAvg);
        writeOut.close();
        
        //Output from file to console
        Scanner inResults = new Scanner(output);
        while( inResults.hasNextLine() )
        {
            System.out.println(inResults.nextLine());
        }
        inResults.close();
        
    } //end main()
}//end HeatIndex