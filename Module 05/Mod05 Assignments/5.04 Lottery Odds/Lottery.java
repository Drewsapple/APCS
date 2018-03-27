/**
 * Description for 5.04 Lottery project
 * 
 * @author Drew Fisher
 * @version 11/10/15
 */
import java.util.Scanner;
public class Lottery
{
    public static void main(String[] args)
    {
        //declare and initialized variables and objects
        Scanner sc = new Scanner(System.in);
        
        String lotteryNum = "";
        String userGuess = "";
        int count = 0;
        
        
        //Generate a 3-digit "lottery" number composed of random numbers
        //Simulate a lottery by drawing one number at a time and 
        //concatenating it to the string
        //Identify the repeated steps and use a for loop structure
        
        for(count=0;count<3;count++){
            lotteryNum = lotteryNum+(int)(Math.random()*10);
        }
        
        
        
        //Input: Ask user to guess 3 digit number
        System.out.print("Pick the  three numbers you think will be drawn (000-999):\t");
        userGuess = sc.next();
      
      
        //Compare the user's guess to the lottery number and report results
        if(userGuess.equals(lotteryNum)){
            System.out.println("Winner! You got all 3. The numbers were "+lotteryNum+".");
        }
        else if((userGuess.substring(0,2)).equals((lotteryNum.substring(0,2)))){
            System.out.println("Winner! You got the first 2. The numbers were "+lotteryNum+".");
        }
        else if((userGuess.substring(1,3)).equals((lotteryNum.substring(1,3)))){
            System.out.println("Winner! You got the last 2. The numbers were "+lotteryNum+".");
        }
        else{
            System.out.println("Sorry, The numbers were "+lotteryNum+".");
        }
        
    } //end main
}//end class Lottery