/**
 * This program chooses a random number in a user chosen range and makes the
 * user guess it
 * @author Drew Fisher
 * @version 11/4/15
 * 
 */ 
import java.util.Scanner;
public class GuessingGameV2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pick the low end of the range:\t");
        int lowEnd = sc.nextInt();
        System.out.print("\n");
        System.out.print("Pick the high end of the range:\t");
        int highEnd = sc.nextInt();
        System.out.print("\n");
        
        int range = highEnd-lowEnd;
        
        System.out.println("The computer has guessed a whole number between "+lowEnd+" and "+highEnd+".");
        System.out.print("Enter what you think it is:\t");
        int guess = sc.nextInt();
        System.out.print("\n");
        int answer = (int)((Math.random()*range)+lowEnd);
        String high;
        while(answer != guess)
        {
            if(guess<=answer){high = " low";}
            else{high = " high";}
            System.out.println("That was too"+high+". Guess again.");
            System.out.print("Enter what you think it is:\t");
            guess = sc.nextInt();
            System.out.print("\n");
        }
        System.out.println("Congratulations! You got it right!");
        System.out.println("The computer was thinking of the number "+answer+".");
    }
}