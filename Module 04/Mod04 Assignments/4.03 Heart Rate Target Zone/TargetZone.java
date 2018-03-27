/**
 * This program calculates the user's target heart rate and tells them 
 * if they do their exercise at the proper heart rate.
 * 
 * @version 10/30/15
 * @author Drew Fisher
 */
import java.util.Scanner;
public class TargetZone
{
    public static void main(String[] args)
    {
        System.out.println("Calculate your target heart rate here.");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What is your Age?  ");
        String ageString = sc.next();
        int age = Integer.parseInt(ageString);
        
        System.out.print("What is your resting heart rate?  ");
        String restingHeartRate = sc.next();
        int restRate = Integer.parseInt(restingHeartRate);
        
        System.out.print("What is your heart rate after exercising?  ");
        String activeHeartRate = sc.next();
        int activeRate = Integer.parseInt(activeHeartRate);
        
        int maxRate = 220-age;
        int reserveRate = maxRate-restRate;
        double highTarget = (reserveRate*.85)+restRate;
        double lowTarget = (reserveRate*.5)+restRate;
        
        System.out.println("Your target heart rate zone is from "+lowTarget+" to "+highTarget+".");
        
        if(activeRate < lowTarget)
        {
            System.out.println("You are below your target heartrate zone after exercising.");
        }
        else if(activeRate > highTarget)
        {
            System.out.println("You are above your target heartrate zone after exercising.");
        }
        else if(activeRate >= lowTarget && activeRate <= highTarget)
        {
            System.out.println("You are in your target heartrate zone after exercising.");
        }
        else
        {
            System.out.println("There was an error");
        }
        
        
    }
}