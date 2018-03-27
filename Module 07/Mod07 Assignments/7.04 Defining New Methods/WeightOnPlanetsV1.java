/**
 * Shows weight on different planets
 *
 * @author Drew Fisher
 * @version 12/29/15
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class WeightOnPlanetsV1{

    // write static methods here
    // Note: formula for finding weight on a planet:  Earth weight divided by Gravity constant times surface gravity
    public static double[] calcWeight(double earthWeight, double[] gravity){
        double[] weight = new double[9];
        for(int index = 0; index < 9; index++){
            weight[index]=(earthWeight/gravity[2])*gravity[index];
        }
        return weight;
    }
    
    public static double[] getGravity() throws IOException{
        double[] gravity = new double[9];
        File file = new File("Gravity.txt");
		Scanner in = new Scanner(file);
		for(int index = 0; index < 9; index++){
			gravity[index] = in.nextDouble();
		}
		return gravity;
    }
    public static void printResults(String[] names, double[] gravity, double[] weight){
        System.out.print("\n");
		System.out.printf("%-1s %-15s %-15s %-15s %n","","Planet","Gravity","Weight(lbs)");
	    System.out.printf("%47.47s %n","----------------------------------------------------------------------------------------------------------------------------------");
		for(int index = 0;index<9;index++){
			System.out.printf("%-1s %-15s %-15.3f %-15.3f %n","",names[index],gravity[index],weight[index]);
		}
    }
    public static double getEarthWeight(){
        System.out.printf("%40s %n","Your Weight on Planets");
        System.out.printf("%40s","Enter Your weight here(lbs):\t");
        Scanner sc = new Scanner(System.in);
		double earthWeight = sc.nextDouble();
		return earthWeight;
    }
    public static void main(String[] args)throws IOException{
		double earthWeight = getEarthWeight();
		String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
		double[] gravity = getGravity();  						// static method you write
		double[] weight = calcWeight(earthWeight, gravity);  // static method you write
		printResults(names, gravity, weight); 					// static method you write
    } //end main
}//end class