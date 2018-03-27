import java.io.File;
import java.util.*;
import java.io.IOException;

public class FrequencyAnalysis{
    private final String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u","v", "w", "x", "y", "z"};
    private List<Integer> numPerLetter = new ArrayList<Integer>(){};
    private int totalLetters = 0;
    private String filename = "";
    
    public FrequencyAnalysis(String fn){
        for(int i = 0; i < 26;i++){
            numPerLetter.add(0);
        }
        filename = fn;
    }
    
    public List<Integer> numChars(List<String> in){
        for(int i = 0;i < in.size();i++){
            countChars(in.get(i));
        }
        return numPerLetter;
    }
    
    public void countChars(String word){
        for(int x = 0; x < word.length(); x++){
                for(int c = 0; c < letters.length;c++){
                    if(word.substring(x,x+1).equalsIgnoreCase(letters[c])){
                        numPerLetter.set(c,numPerLetter.get(c) + 1);
                        totalLetters++;
                        //break;
                    }
                }
            }
    }
    public List<String> getWords() throws IOException{
        File inFile = new File(filename);
        Scanner sc = new Scanner(inFile);
        List<String> words = new ArrayList<String>(){};
        while(sc.hasNext()){
            words.add(sc.next());
        }
        return words;
    }
    public int getTotal(){
        return totalLetters;
    }
    public String[] getLetters(){
        return letters;
    }
}