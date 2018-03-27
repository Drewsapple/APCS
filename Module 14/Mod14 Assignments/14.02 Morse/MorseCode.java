import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MorseCode{
    public static String encode(String m) throws IOException{
        File tableIn;
        Scanner sc;
        try{
            tableIn = new File("MorseCode.txt");
            sc = new Scanner(tableIn);
        }
        catch(IOException ex){
            tableIn = new File("MorseCode.txt");
            sc = new Scanner(tableIn);
        }

        ArrayList keyList = new ArrayList();
        ArrayList morseList = new ArrayList();
        while(sc.hasNextLine()){
            
            String row = sc.nextLine();
            char key = row.charAt(0);
            String morse = row.substring(row.indexOf(" "),row.length());
            keyList.add(key);
            morseList.add(morse);
            
        }
        
        String msg = m.toLowerCase().trim();
        String out = "";
        
        for(int c = 0; c < msg.length(); c++){
            
            if(keyList.indexOf(msg.charAt(c)) != -1){
                out += morseList.get(keyList.indexOf(msg.charAt(c))) + " ";
            }
            else{}
            
        }
        return out;
    }
}