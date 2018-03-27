/**
 * This program creates an email based on input to notify about a book being
 * overdue.
 * 
 * @author Drew Fisher 
 * @version 10/28/15
 * 
 */
import java.util.Scanner;                       
public class Mona
{
    public static void main(String[] args)
    {       
        
        Scanner in = new Scanner(System.in); 
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        
        System.out.print("Please enter the borrower's name (Last, First):  ");
        String lastName = in.next();
        String firstName = in.next();
        System.out.print("\n");
        
        System.out.print("Please enter the borrower's phone number in the format of (XXX) XXX-XXXX:  ");
        String phoneNumber1 = scan2.nextLine();
        System.out.print("\n");
        
        System.out.print("Please enter the title of the book:  ");
        String bookTitle = scan2.nextLine();
        System.out.print("\n");
        
        System.out.print("Please enter the date the book was checked out (mm/dd/yy):  ");
        String checkoutDate = scan2.nextLine();
        System.out.print("\n");
        
        System.out.print("Please enter how log the book has been overdue (in days):  ");
        String timeOverdue = scan3.next();
        System.out.print("\n");
        
        System.out.print("Please enter the daily overdue fee:  ");
        System.out.print("$");
        String fee = scan3.next();
        System.out.println();
        
        String lastNoComma = lastName.substring(0,lastName.indexOf(","));
        int overdue = Integer.parseInt(timeOverdue);
        double fine = overdue*(Double.parseDouble(fee));
        String email = firstName.substring(0,1)+lastName.substring(0,1)+phoneNumber1.substring(10,14)+"@csamediacenter.com";

        
        String plural;
        String dollars;
        
        if(overdue == 1){
            plural = " day ";
        }
        else{
            plural = " days ";
        }
        if(fine == 1.0){
            dollars = " dollar.";
        }
        else{
            dollars = " dollars.";
        }
        
        System.out.println("------------------------------------------------------------");
        System.out.println();
        System.out.println("                         Email Text                         ");
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println();
        System.out.println("To: "+firstName+" "+lastNoComma+" ("+email+")");
        System.out.println("From: Mona (mona@csamediacenter.com)");
        System.out.println("Subject: Overdue Book");
        System.out.println("------------------------------------------------------------");
        System.out.println();
        System.out.println("\""+bookTitle+"\"" + " was checked out on: " + checkoutDate);
        System.out.println("This book is currently "+timeOverdue+plural+"late.");
        System.out.println("Your fine had accumulated to: $"+fine+dollars);
        
    }
}