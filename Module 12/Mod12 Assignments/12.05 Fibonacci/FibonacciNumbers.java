/**
 * Finds the nth Fibonacci number
 * @author Drew Fisher
 * @version 2/18/16
 */

import java.util.Scanner;
import java.io.IOException;
public class FibonacciNumbers{
    public static void main(String[] args) throws IOException{
        boolean keepGoing = true;
        while(keepGoing){
            System.out.println("What is the location of the Fibonacci Number that you want?");
            boolean isValid = false;
            int number = 0;
            Scanner sc = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            while(!isValid){
                int localNum = sc.nextInt();
                if(localNum > 0 && localNum < 48){
                    number = localNum;
                    isValid = true;
                }
                else{
                    System.out.println("That number isn't valid.");
                }
            }
            System.out.println("The number at that location is: "+fibonacci(number-1));
            System.out.println("Would you like to do another? (Y/n) ");
            String doAnother = sc2.nextLine();
            if(doAnother.equalsIgnoreCase("n")){
                keepGoing = false;
            }
            else{}
        }
    }
    public static int fibonacci(int recursions){
        int number = 0;
        if(recursions == 1 || recursions == 2){
            return 1;
        }
        else{
            if(recursions > 2){
                number = fibonacci(recursions-1) + fibonacci(recursions-2);
            }
            else{}
            return number;
        }   
    }
}