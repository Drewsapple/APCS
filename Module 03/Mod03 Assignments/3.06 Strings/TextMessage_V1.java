
/**
 * The purpose of this program is to demonstrate the use of several 
 * methods of the String class.
 * 
 * @author Drew Fisher 
 * @version 10/20/15
 */
public class TextMessage_V1
{
	public static void main(String[ ] args)
	{
	    String oldString = "i got to go soon, but i'll be right back";
	    System.out.println("Original Message: "+oldString);
	    System.out.println("Length of the original message: " + oldString.length()+ " characters long");
	    System.out.println();
	    String newString = oldString;
	    newString = newString.replace("got to go","gtg");
	    newString = newString.replace("i don't know", "idk");
	    newString = newString.replace("laughing out loud", "kek");
	    newString = newString.replace("in my opinion", "imo");
	    newString = newString.replace("be right back", "brb");
	    newString = newString.replace("just kidding","jk");
	    System.out.println("New Message: "+newString);
	    System.out.println("Length of the new message: " + newString.length()+ " characters long");
	    System.out.println();
	    
	    System.out.println("Substrings");
	    System.out.println();
	    System.out.println("First location of the letter i: " + newString.indexOf("i"));
	    System.out.println("First ten characters: "+ newString.substring(0,9));
	    System.out.println("Third character is: "+newString.charAt(2));
	    System.out.println("Capitalize the letter i: "+newString.replace("i","I"));
	}//end of main method
}//end of class