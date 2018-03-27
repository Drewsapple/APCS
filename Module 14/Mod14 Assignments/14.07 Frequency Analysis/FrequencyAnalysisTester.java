import java.util.*;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
/**
 * This program tests the frequency of letters in a document writes it to the console and a file.
 * @author Drew Fisher
 * @version 5/31/16
*/
public class FrequencyAnalysisTester{
    public static void main(String[] args) throws IOException{
        plaintext();
        cipher();
    }
    public static void plaintext() throws IOException{
        FrequencyAnalysis obj = new FrequencyAnalysis("plaintext.txt");
        List<String> words = obj.getWords();
        List<Integer> count = obj.numChars(words);
        int total = obj.getTotal();
        String filename = "plaintextfreq.txt";
        String[] letters = obj.getLetters();
        print(count,total);
        printToFile(filename,count,total,letters);
    }
    public static void cipher() throws IOException{
        FrequencyAnalysis obj2 = new FrequencyAnalysis("ciphertext.txt");
        List<String> words = obj2.getWords();
        List<Integer> count = obj2.numChars(words);
        int total = obj2.getTotal();
        String filename = "ciphertextfreq.txt";
        String[] letters = obj2.getLetters();
        print(count,total);
        printToFile(filename,count,total,letters);
    }
    public static void print(List<Integer> values,int total){
        System.out.print("|  Letter  |   A   |   B   |   C   |   D   |   E   |   F   |   G   |   H   |   I   |   J   |   K   |   L   |   M   |   N   |   O   |   P   |   Q   |   R   |   S   |   T   |   U   |   V   |   W   |   X   |   Y   |   Z   |\n");
        System.out.print("|----------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|\n");
        System.out.print("|Occurences|");
        for(int i = 0;i < values.size();i++){
            System.out.printf("%6d |",values.get(i));
        }
        System.out.println();
        System.out.print("|Frequency |");
        for(int i = 0;i < values.size();i++){
            System.out.printf("%05.2f%% |",100*(values.get(i)/(double)total));
        }
        System.out.println();
    }
    public static void printToFile(String filename,List<Integer> values,int total,String[] letters) throws IOException{
        File f = new File(filename);
        PrintWriter p = new PrintWriter(f);
        p.println("|  Letter  |Occurences|Frequency |");
        p.println("|----------|----------|----------|");
        for(int i = 0;i < values.size();i++){
            p.printf("|     %s    |",letters[i].toUpperCase());
            p.printf("%9d |",values.get(i));
            p.printf(" %7.2f%% |\n",100*(values.get(i)/(double)total));
        }
        p.close();
    }
}