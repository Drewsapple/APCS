import java.util.*;
/**
 * Tester class using arraylists
 * @author Drew Fisher
 * @version 5/24/16
*/
public class TestCandidate2{
    public static void main(String[] args){
        List<Candidate> election = new ArrayList<Candidate>();
        election.add(new Candidate("John Smith",5000));
        election.add(new Candidate("Mary Miller",4000));
        election.add(new Candidate("Michael Duffy",6000));
        election.add(new Candidate("Tim Robinson",2500));
        election.add(new Candidate("Joe Ashtony",1800));
        
        printVotes(election);
        System.out.println();
        printResults(election);
    }
    public static void printVotes(List<Candidate> in){
        System.out.println("Results per candidate:");
        for(int i=0; i < in.size(); i++){
            System.out.println(in.get(i).toString()+" recieved "+in.get(i).getNumVotes()+" votes.");
        }
    }
    public static int getTotal(List<Candidate> in){
        int votes = 0;
        for(int i=0; i < in.size(); i++){
            votes += in.get(i).getNumVotes();
        }
        return votes;
    }
    public static void printResults(List<Candidate> in){
        System.out.printf("%-20s %-20s %-20s %n","Name","Number of Votes","Percentage of Votes");
        for(int i=0; i < in.size(); i++){
            double percent = 100*in.get(i).getNumVotes()/(double)getTotal(in);
            System.out.printf("%-20s %-20s %2.2f%% %n",in.get(i).toString(),in.get(i).getNumVotes(),percent);
        }
        System.out.println();
        System.out.println("Total number of votes in election: "+getTotal(in));
    }
}