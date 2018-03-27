import java.util.Scanner;
import java.io.IOException;
/**
 * Tester class for Morse Code.
 * @author Drew Fisher
 * @version 4/25/16
*/
public class MorseCodeTester{
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your messsage to be encoded (no punctuation): ");
        String message = in.nextLine();
        System.out.println(MorseCode.encode(message));
    }
}