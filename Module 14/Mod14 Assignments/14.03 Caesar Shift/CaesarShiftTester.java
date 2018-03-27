import java.util.Scanner;
import java.io.IOException;
/**
 * Tester class for Caesar shifts. 
 * @author Drew Fisher
 * @version 4/26/16
*/ 
public class CaesarShiftTester{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        Scanner msg = new Scanner(System.in);
        Scanner shift = new Scanner(System.in);
        Boolean cont = true;
        String choice = "";
        while(cont){
            System.out.print("Choose Encryption or Decryption (E/D): ");
            choice = sc.nextLine();
            if(choice.equalsIgnoreCase("E")){
                System.out.println("Enter your message here:");
                String message = msg.nextLine().trim().toUpperCase();
                System.out.println("Enter the cipher number here (0-25):");
                int shiftNum = shift.nextInt();
                System.out.println(CaesarShiftEncryption.encrypt(message, shiftNum));
            }
            else if(choice.equalsIgnoreCase("D")){
                System.out.println("Enter the encrypted message here:");
                String message = msg.nextLine().trim().toUpperCase();
                System.out.println("Enter the cipher number here (0-25):");
                int shiftNum = shift.nextInt();
                System.out.println(CaesarShiftEncryption.decrypt(message, shiftNum));
            }
            else{
                System.out.println("That's not a valid option.");
            }
            System.out.print("Would you like to continue?(y/N): ");
            choice = sc.nextLine();
            if(choice.equalsIgnoreCase("n")){
                cont = false;
            }
            else{}
        }
    }
}