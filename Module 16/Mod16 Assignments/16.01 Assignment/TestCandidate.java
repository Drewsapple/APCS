import java.util.*;
/**
 * Tester class using arraylists
 * @author Drew Fisher
 * @version 5/24/16
*/
public class TestCandidate{
    public static void main(String[] args){
        Candidate[] election = {
            new Candidate("John Smith",5000),
            new Candidate("Mary Miller",4000),
            new Candidate("Michael Duffy",6000),
            new Candidate("Tim Robinson",2500),
            new Candidate("Joe Ashtony",1800)
        };
        
        printVotes(election);
        System.out.println();
        printResults(election);
    }
    public static void printVotes(Candidate[] in){
        System.out.println("Results per candidate:");
        for(int i=0; i < in.length; i++){
            System.out.println(in[i].toString()+" recieved "+in[i].getNumVotes()+" votes.");
        }
    }
    public static int getTotal(Candidate[] in){
        int votes = 0;
        for(int i=0; i < in.length; i++){
            votes += in[i].getNumVotes();
        }
        return votes;
    }
    public static void printResults(Candidate[] in){
        System.out.printf("%-20s %-20s %-20s %n","Name","Number of Votes","Percentage of Votes");
        for(int i=0; i < in.length; i++){
            double percent = 100*in[i].getNumVotes()/(double)getTotal(in);
            System.out.printf("%-20s %-20s %2.2f%% %n",in[i].toString(),in[i].getNumVotes(),percent);
        }
        System.out.println();
        System.out.println("Total number of votes in election: "+getTotal(in));
    }
}