/**
 * Calculates Surface Gravity
 *
 * @author Drew Fisher
 * @version 12/29/15
 */
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class GravityV1
{
	// calcGravity returns an array of doubles containing the gravity values
	//and takes two arrays of doubles as parameters for the radius values and mass
	public static double[] calcGravity(double[] radii, double[] mass)
	{
		// fill in code here
		// The formula to calculate gravity is:
		// 6.67E-17 times the massOfPlanet divided by the radius of the planet squared
		double[] gravity = new double[9];
		for(int index = 0; index < 9; index++){
			gravity[index] = (6.67E-17*mass[index])/Math.pow(radii[index],2);
		}
		
		return gravity;
	}
	
	public static double[] calcDiameter(double[] radii){
		double[] diameters = new double[9];
		for(int index = 0; index < 9; index++){
			diameters[index]=radii[index]*2;
		}
		return diameters;
	}
	
	// printResults will print the table to output screen
	// return type is voide because no values are returned
	public static void printResults(String[] names, double[] diameters, double[] mass, double gravities[]){
		// fill in code here
		System.out.printf("%40s %n","Planetary Data");
		System.out.printf("%-1s %-15s %-15s %-15s %-15s %n","","Planet","Diameter (km)","Mass (kg)","g (m/s^2)");
		System.out.printf("%59.59s %n","----------------------------------------------------------------------------------------------------------------------------------");
		for(int index = 0;index<9;index++){
			System.out.printf("%-1s %-15s %-15s %-15.2E %-15.4f %n","",names[index],diameters[index],mass[index],gravities[index]);
		}
	}

	//print the gravity values to text file
	public static void printToFile(double[] gravities)throws IOException
	{
		File outfile = new File("Gravity.txt");
		PrintWriter printToFile = new PrintWriter(outfile);
		for(int index = 0;index<9;index++){
			printToFile.printf("%-15s %n",gravities[index]);
		}
		printToFile.close();
	}

    public static void main(String[] args)throws IOException
    {
        // Initialize variables
		String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
		double[] radii = {2439.7, 6051.9, 6378, 3402.5, 71492, 60270, 25562, 24774, 1195};
		// double[] masses = {3.3022 * Math.pow(10,23), 4.8685 * Math.pow(10,24), 5.9736 * Math.pow(10,24), 6.4185 * Math.pow(10,23), 1.8986 * Math.pow(10,27), 5.6846 * Math.pow(10,26), 8.6810 * Math.pow(10,25), 1.0243 * Math.pow(10,26), 1.312 * Math.pow(10,22)};
        // or using big E notation:
		double [] mass = {3.30E23, 4.87E24, 5.97E24, 6.42E23, 1.90E27, 5.68E26, 8.68E25, 1.02E26, 1.27E22}; // See IMACS double lesson for big E notation
		// Processing
		double[] gravities = calcGravity(radii, mass);
		double[] diameters = calcDiameter(radii);
		// Output
		printResults(names, diameters, mass, gravities);
		printToFile(gravities);


    } //end main
}//end class