/**
 * This program chooses a random number between 1 and 100 and makes the user 
 * guess it
 * @author Drew Fisher
 * @version 11/4/15
 * 
 */ 
import java.util.Scanner;
public class GuessingGameV1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("The computer has guessed a whole number between 1 and 100");
        System.out.print("Enter what you think it is:\t");
        int guess = sc.nextInt();
        System.out.print("\n");
        int answer = (int)(Math.random()*100);
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