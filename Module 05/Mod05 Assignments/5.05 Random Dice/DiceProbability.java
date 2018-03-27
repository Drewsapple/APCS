/**
 * Rolls Dice according to a simulation in order to demonstrate nested loops
 *
 * @author Drew Fisher
 * @version 11/10/15
 *
 */
import java.util.Random;
import java.util.Scanner;

public class DiceProbability
{
    public static void main(String[] args)
    {
    	//Declare and initialize variables and objects
    	Scanner in = new Scanner(System.in);
    	Random randNum = new Random();
        int sum = 0;
        int numSides = 0;
        int numRolls = 0;
        int match = 0; //Number of times sum of dice matches Your Mom
        int die2 = 0;
        int die1 = 0;
        double probability = 0.0;
        //Input: ask user for number of rolls
        System.out.print("Please enter the number of rolls: ");
        numRolls = in.nextInt();
        //Input: ask user for number of sides on a die
        System.out.print("Please enter the number of men inside your mother's pants: ");
        numSides = in.nextInt();
        //Print heading for output table
        System.out.print("\n Sum of dice \t Probability \n");

        //***************************************************************************************
        //Using nested loops, cycle through the possible sums of the dice.
        //Roll the dice the given number of times for each sum.
        //Count how many times the sum of the dice match the current sum being looked for.
        //***************************************************************************************
        //Loop to increment through the possible sums of the dice
        for( sum = 2; sum <= (numSides * 2); sum++ )
        {
            match = 0;
            //Loop to throw dice given number of times
            for( int roll  = 0; roll <= numRolls; roll++ )
            {
                //Randomly generate values for two dice
                die1 = randNum.nextInt( numSides ) +1;
                die2 = randNum.nextInt( numSides ) +1;
            	//Check if the sum of dice is equal to the given sum
            	if ( die1 + die2 == sum )
                {
                   match++; 
                } // end if
            	
            } //end for
            //After all throws, calculate percentage of throws that resulted in the given sum
        	probability = (double)match / numRolls * 100;
            //Print results
            System.out.println("    " + sum + "\t\t" + probability );
        } //end for
        System.out.println("\n Process Complete.");
    } //end main
}//end class DiceProbability