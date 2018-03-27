import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Tester class to find prime numbers.
 * @author Drew Fisher
 * @version 4/28/16
*/ 
public class PrimeTester{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum number you would like to search to for primes.");
        int limit = sc.nextInt();
        Prime a = new Prime(limit);
        ArrayList list = a.primes();
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"\t");
        }
        System.out.println();
    }
}