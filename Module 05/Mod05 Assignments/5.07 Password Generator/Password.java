/**
 * Generates a random Password
 * 
 * @author Drew Fisher
 * @version 11/18/15
*/
import java.util.Scanner;
public class Password{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int chars = 0;
        int menuChoice = 0;
        int low1 = 97;
        int low2 = 65;
        int low3 = 48;
        int high1 = 122;
        int high2 = 90;
        int high3 = 57;
        char charOut = 0;
        
        System.out.println("Welcome to the Password Generator.");
        System.out.println("        Password Generation Menu        ");
        System.out.println("----------------------------------------");
        System.out.println("[1] Lowercase Only");
        System.out.println("[2] Both Cases");
        System.out.println("[3] Both Cases With Numbers");
        System.out.println("[4] Both Cases With Numbers and Punctuation");
        System.out.println("[5] Exit");
        menuChoice = sc.nextInt();
        
        if(menuChoice < 5){
            System.out.println("Please enter the number of characters in the password.");
            chars = sc.nextInt();
            
            for(int counter = 0;counter < chars; counter++){
                double randNum1 = Math.random();
                double randNum2 = Math.random();
                
                if(menuChoice == 1){
                    charOut = (char)((int)(randNum1*(high1-low1+1))+low1);
                    System.out.print(charOut);
                }
                else if(menuChoice == 2){
                    if(randNum2 < .5){
                        charOut = (char)((int)(randNum1*(high1-low1+1))+low1);
                        System.out.print(charOut);
                    }
                    else{
                        charOut = (char)((int)(randNum1*(high2-low2+1))+low2);
                        System.out.print(charOut);
                    }
                    
                }
                else if(menuChoice == 3){
                    if(randNum2 < 0.41935483871){
                        charOut = (char)((int)(randNum1*(high1-low1+1))+low1);
                        System.out.print(charOut);
                    }
                    else if(randNum2 < 0.83870967741){
                        charOut = (char)((int)(randNum1*(high2-low2+1))+low2);
                        System.out.print(charOut);
                    }
                    else{
                        charOut = (char)((int)(randNum1*(high3-low3+1))+low3);
                        System.out.print(charOut);
                    }
                }
                else if(menuChoice == 4){
                    charOut = (char)((int)(randNum1*(high1-low3+1))+low3);
                    System.out.print(charOut);
                    
                }
            }
            System.out.println();
        }
        else if(menuChoice == 5){
            System.out.println("You Picked Exit.\nExiting.");
        }
        else{
            System.out.println("There was an error.\nExiting.");
        }
    }
}