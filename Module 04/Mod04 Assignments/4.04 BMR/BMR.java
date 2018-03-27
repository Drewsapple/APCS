/**
 * calculates your Basal Metabolic Rate based on user input
 * 
 * @version 10/31/15
 * @author Drew Fisher
 */
import java.util.Scanner;
public class BMR
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double bmr;
        System.out.print("What is your name?  ");
        String name = sc.nextLine();
        
        System.out.print("What is your gender? (M/F)  ");
        String gender = sc.next();
        
        System.out.print("What is your age?  ");
        String age = sc.next();
        
        System.out.print("What is your height in inches?  ");
        String inches = sc.next();
        
        System.out.print("What is your weight in pounds?  ");
        String pounds = sc.next();
        
        System.out.print("\n\n");
        
        System.out.print("Calculate Your Basal Metabolism");
        double centimeters = (int)(Integer.parseInt(inches)*25.4)/10.0;
        double kilograms = (int)(Integer.parseInt(pounds)*4.54)/10.0;
        System.out.print("\n\n");
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Weight (kg): "+kilograms);
        System.out.println("Height (cm): "+centimeters);
        if(gender.charAt(0) == 'M')
        {
            bmr = (13.7516*kilograms)+(5.0033*centimeters)-(6.755*Integer.parseInt(age))+66.4730;
        }
        else
        {
            bmr = (9.5634*kilograms)+(1.8496*centimeters)-(4.6756*Integer.parseInt(age))+655.0955;
        }
        System.out.println("Basal Metabolic Rate: "+((int)(bmr*10)/10.0)+" kcal per day.");
        
        
        
    }
}