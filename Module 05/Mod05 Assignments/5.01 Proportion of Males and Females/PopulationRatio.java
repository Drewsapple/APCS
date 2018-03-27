
/**
 * This program models the distribution of men and women in Monico
 * 
 * @author B. Jordan
 * @modified by Drew Fisher
 * @version 11/3/15
 */
import java.util.Scanner;
public class PopulationRatio
{
	public static void main(String[] args)
	{
	    int women = 0;
	    int men = 0;
	    int counter = 1;
	    double randNum = 0.0;
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("How many people are in the population sample? ");
	    int population = in.nextInt();
	    
	    while(counter <= population)
	    {
	        randNum = Math.random();
	        
	        
	        if(randNum < .51)
	        {
	            women++;
	            System.out.println("Female");
	        }
	        else
	        {
	            men++;
	            System.out.println("Male");
	           }
	        counter++;      
	    }
	    System.out.println();
	    System.out.println("Number of Women = " + women);
	    System.out.println("Number of Men = " + men);
	    
	    
	    
	}
}