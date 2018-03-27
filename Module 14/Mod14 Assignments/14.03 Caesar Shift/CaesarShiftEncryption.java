import java.util.ArrayList;
public class CaesarShiftEncryption{
    private static final ArrayList<String> ALPHABET = new ArrayList<String>(){{add("A");add("B");add("C");add("D");add("E");add("F");add("G");add("H");add("I");add("J");add("K");add("L");add("M");add("N");add("O");add("P");add("Q");add("R");add("S");add("T");add("U");add("V");add("W");add("X");add("Y");add("Z");}};
    public static String encrypt(String m, int s){
        return shiftIt(m,s);
    }
    public static String decrypt(String m, int s){
        return shiftIt(m,-s+26);
    }
    private static String shiftIt(String m, int s){
        String out = "";
        for(int c=0;c<m.length();c++){
            int letterNum = ALPHABET.indexOf(m.substring(c,c+1));
            if(letterNum != -1){
                out = out+ALPHABET.get((letterNum+s)%26);
            }
            else{
                out = out+m.charAt(c);
            }
        }
        return out;
    }
}