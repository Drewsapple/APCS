/**
 * Calculates BMI and the proper catergory that matches
 * 
 * @version 11/1/15
 * @author Drew Fisher
 */
import java.util.Scanner;
public class BMI
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What is your name (first last)?  ");
        String first = sc.next();
        String last = sc.next();
        System.out.print("What is your weight in pounds?  ");
        String pounds = sc.next();
        System.out.print("What is your height in feet and inches (5 11)?  ");
        String feet = sc.next();
        String inches = sc.next();
        System.out.print("\n\n");
        
        System.out.print("Body Mass Index Calculator");
        double meters = (int)(((Integer.parseInt(feet)*12)+(Integer.parseInt(inches)))*.254)/10.0;
        double kilograms = (int)(Integer.parseInt(pounds)*4.53592)/10.0;
        double bmi = (int)((kilograms/(meters*meters))*10.0)/10.0;
        System.out.print("\n\n");
        System.out.println("Name: "+first+" "+last);
        System.out.println("Height (m):"+meters);
        System.out.println("Weight (kg): "+kilograms);
        System.out.println("BMI: "+bmi);
        
        String category;
        if(bmi <= 18.5) //underweight
        {
            category = "Eat some damn meat";
        }
        else if(bmi <= 24.9)
        {
            category = "Normal/Healthy Weight";
        }
        else if(bmi <= 29.9) //overweight
        {
            category = "Diabeetus";
        }
        else //obese
        {
            category = "You'd better go on a fucking diet";
        }
        System.out.println("Category: "+category);
        
        
        
    }
}