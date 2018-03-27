/**
 * Checks if a statement is a palindrome
 * @author Drew Fisher
 * @version 2/29/16
 */
import java.util.Scanner;

public class RecursivePalindromeTester{
    public static void main(String[] args){
        boolean keepGoing = true;
        while(keepGoing){
            Scanner sc = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            RecursivePalindrome palindrome = new RecursivePalindrome();
            System.out.println("Is it a Palindrome?");
            System.out.println("Enter it here:  ");
            String original = sc.nextLine();
            boolean isPalindrome = palindrome.check(original);
            if(isPalindrome){
                System.out.println("This is a palindrome.");
            }
            else{
                System.out.println("This is not a palindrome.");
            }
            System.out.println("Would you like to do another? (Y/n) ");
            String doAnother = sc2.nextLine();
            if(doAnother.equalsIgnoreCase("n")){
                keepGoing = false;
            }
            else{}
        }
    }
}