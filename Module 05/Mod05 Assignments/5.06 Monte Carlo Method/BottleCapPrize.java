/**
* Calculate the percentage of time that you are a winner
* @author Drew Fisher
* @version 11/12/15
*
*/import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class BottleCapPrize
{
    public static void main(String[] args) throws IOException
    {
    	Scanner sc = new Scanner(System.in);
    	Random randNum = new Random();
    	File filename = new File("results.txt");
    	PrintWriter toFile = new PrintWriter(filename);
    	
        int cap = 0;
        int numCaps = 0;
        int capWin = 5;
        int win = 0;
        int numLines = 0;
        double probability = 0.0;
        
        System.out.print("Please enter the number of caps: ");
        numCaps = sc.nextInt();
        
        for( int capNum  = 0; capNum < numCaps; capNum++ )
        {
            cap = randNum.nextInt( capWin ) +1;
        	if (cap==1)
            {
               toFile.println("win");
            }
            else
            {
                toFile.println("loss");
            }
        	
        }
        toFile.close();
        Scanner fromFile = new Scanner(filename);
        while(fromFile.hasNextLine()){
            String winLoss = fromFile.nextLine();
            if(winLoss.equals("win"))
            {
                win++;
                numLines++;
            }
            else
            {
                numLines++;
            }
        }
        fromFile.close();
    	probability = (double)win / numLines * 100;
    	System.out.println("Probability of winning = "+probability);

}
}