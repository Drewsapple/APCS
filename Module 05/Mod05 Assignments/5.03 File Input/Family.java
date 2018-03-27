/**
 * This program reads and processses data from a text file
 * 
 * @author Drew Fisher
 * @version 11/9/15
 */
 import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
   public static void main(String[] args) throws IOException
   {
      String token = "";
      File fileName = new File("MaleFemaleInFamily.txt");
      Scanner inFile = new Scanner(fileName);
      int girls = 0;
      int boys = 0;
      int both = 0;
      int line = 0;
      while (inFile.hasNext())
      {
        token = inFile.next();
        if(token.equalsIgnoreCase("BB"))
        {
            boys++;
            line++;
        }
        else if(token.equalsIgnoreCase("GG"))
        {
            girls++;
            line++;
        }
        else if(token.equalsIgnoreCase("BG")||token.equalsIgnoreCase("GB"))
        {
            both++;
            line++;
        }
        else
        {
            System.out.println("There was an error");
        }
      }
    System.out.println("Sample size: "+line);
    System.out.println("2 Boys: "+boys);
    System.out.println("2 Girls: "+girls);
    System.out.println("1 of Each: "+both);
        
      inFile.close();
    }//end of main method
}//end of class 