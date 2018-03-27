/**
 * Hurricanes description: Displays data from Hurricanes
 *
 * @author: Drew Fisher
 * @version: 11/30/15
 *
 */


import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Hurricanes2
{
    public static void main(String[] args)throws IOException
    {
    	//declare and initialize variables
		int arrayLength = 59;
        int[] category = new int[arrayLength];
        int [] year = new int[arrayLength];
        String [] month = new String[arrayLength];
        int [] pressure = new int[arrayLength];
        int [] knots = new int[arrayLength];
        String [] name = new String[arrayLength];
        double [] mph = new double[arrayLength];
        int cat1 = 0;
        int cat2 = 0;
        int cat3 = 0;
        int cat4 = 0;
        int cat5 = 0;
        double mphSum = 0.0;
        int pSum = 0;
        int catSum = 0;


        File fileName = new File("hurcdata2.txt");
        Scanner inFile = new Scanner(fileName);

        //INPUT  - read data in from the file
        int index = 0;
        while (inFile.hasNext())
        {
            year[index] = inFile.nextInt();
            month[index] = inFile.next();
            pressure[index] = inFile.nextInt();
            knots[index] = inFile.nextInt();
            name[index] = inFile.next();
            index++;
        }
        inFile.close();


		//PROCESSING - calculate and convert values
		// convert windspeed from knots to MPH
		for(int knotsIndex = 0; knotsIndex < arrayLength; knotsIndex++){
		    mph[knotsIndex] = ((double)(knots[knotsIndex])*1.15078);
		}
		// determine category and count number of each category
		for(int mphIndex = 0; mphIndex < arrayLength; mphIndex++){
		    if(mph[mphIndex] > 157){
		        category[mphIndex]  = 5;
		        cat5++;
		    }
		    else if(mph[mphIndex] > 130){
		        category[mphIndex] = 4;
		        cat4++;
		    }
		    else if(mph[mphIndex] > 111){
		        category[mphIndex] = 3;
		        cat3++;
		    }
		    else if(mph[mphIndex] > 96){
		        category[mphIndex] = 2;
		        cat2++;
		    }
		    else if(mph[mphIndex] > 74){
		        category[mphIndex] = 1;
		        cat1++;
		    }
		    else{
		    }
		}
		//Find min, max and average for category, windspeed and pressure
		Double smallNum = Double.MAX_VALUE;
        for(Double smallMPH : mph){
            if (smallMPH < smallNum){
                smallNum = smallMPH;
            }
        }
        Double bigNum = Double.MIN_VALUE;
        for(Double bigMPH : mph){
            if (bigMPH > bigNum){
                bigNum = bigMPH;
            }
        }
        Integer smallNum2 = Integer.MAX_VALUE;
        for(Integer smallCat : category){
            if (smallCat < smallNum2){
                smallNum2 = smallCat;
            }
        }
        Integer bigNum2 = Integer.MIN_VALUE;
        for(Integer bigCat : category){
            if (bigCat > bigNum2){
                bigNum2 = bigCat;
            }
        }
        Integer smallNum3 = Integer.MAX_VALUE;
        for(Integer smallP : pressure){
            if (smallP < smallNum3){
                smallNum3 = smallP;
            }
        }
        Integer bigNum3 = Integer.MIN_VALUE;
        for(Integer bigP : pressure){
            if (bigP > bigNum3){
                bigNum3 = bigP;
            }
        }
        for(Double avgMPH : mph){
            mphSum += avgMPH;
        }
        Double mphAvg = mphSum/index;
        for(Integer avgP : pressure){
            pSum += avgP;
        }
        Double pAvg = (double)pSum/index;
        for(Integer avgCat : category){
            catSum += avgCat;
        }
        Double catAvg = (double)catSum/index;


        //Output - print table using printf to format the columns
        
        File outputFile = new File("Summary.txt");
        PrintWriter out = new PrintWriter(outputFile);


        out.printf("%44s","Hurricanes 1980 - 2006");
        out.println();
        out.printf("%-9s %-12s %-11s %-17s %-16s %n","Year","Hurricane","Category","Pressure (mb)","Wind Speed (mph)");
        out.printf("=====================================================================\n");
        for(int printer = 0; printer < arrayLength; printer++){
            out.printf("%-9s %-12s %-11s %-17s %-16.5s %n",year[printer],name[printer],category[printer],pressure[printer],mph[printer]);
        }
        
        out.printf("=====================================================================\n");
        out.printf("%-22s %-11.3s %-17.3s %-16.5s %n","Average",catAvg,pAvg,mphAvg);
        out.printf("%-22s %-11s %-17s %-16.5s %n","Maximum",bigNum3,bigNum2,bigNum);
        out.printf("%-22s %-11s %-17s %-16.5s %n","Minimum",smallNum3,smallNum2,smallNum);
        out.println();
        out.println("Number of Category 1 Hurricanes: "+cat1);
        out.println("Number of Category 2 Hurricanes: "+cat2);
        out.println("Number of Category 3 Hurricanes: "+cat3);
        out.println("Number of Category 4 Hurricanes: "+cat4);
        out.println("Number of Category 5 Hurricanes: "+cat5);
        out.close();
        
        Scanner summaryRead = new Scanner(outputFile);
        while( summaryRead.hasNextLine() )
        {
            System.out.println(summaryRead.nextLine());
        }
        summaryRead.close();
    }//end main()
}//end class