/**
 * Prompts user to select a category and tests the menu structure.
 * 
 * @author  Drew Fisher
 * @version 11/1/15
 */
import java.util.Scanner;
public class WellnessMenu
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please select one of the following options from the menu for more information.");
        System.out.println("\nSelect a letter corresponding to a menu option.");
        System.out.println("[A] BMI");
        System.out.println("[B] BMR");                      // provide menu item for BMR
        System.out.println("[C] Healthy Eating");           // provide menu item for Healthy Eating
        System.out.println("[D] Food Pyramid");             // provide menu item for Food Pyramid
        System.out.println("[E] Fitness Training");         // provide menu item for Fitness Training
        System.out.println("Enter A, B, C, D, or E");       // prompt user to enter A, B, C, D, or E: ");
        String choice = sc.next();                          // accept user choice with a Scanner class method
        System.out.println();
        
        if(choice.equalsIgnoreCase("A")) //condition for choice A goes in the parentheses
        {
            System.out.println("Testing: You chose A for BMI");
        }
        else if(choice.equalsIgnoreCase("B")) //condition for choice B goes in the parentheses
        {
            System.out.println("Testing: You chose B for BMR");
        }
        else if (choice.equalsIgnoreCase("C")) //condition for choice C goes in the parentheses
        {
            System.out.println("Testing: You chose C for Healthy Eating");
        }
        else if (choice.equalsIgnoreCase("D")) //condition for choice D goes in the parentheses
        {
            System.out.println("Testing: You chose D for Food Pyramid");
        }
        else if (choice.equalsIgnoreCase("E")) //condition for choice E goes in the parentheses
        {
            System.out.println("Testing: You chose E for Fitness Training");
        }
        else //default choice for an invalid entry
        {
            System.out.println("You chose an invalid letter");
        }
    }
}