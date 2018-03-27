import java.util.*;
/**
 * Tester class using arraylists
 * @author Drew Fisher
 * @version 5/25/16
*/
public class TestCandidate4{
    public static void main(String[] args){
        List<Candidate> election = new ArrayList<Candidate>();
        election.add(new Candidate("John Smith",5000));
        election.add(new Candidate("Mary Miller",4000));
        election.add(new Candidate("Michael Duffy",6000));
        election.add(new Candidate("Tim Robinson",2500));
        election.add(new Candidate("Joe Ashtony",1800));
        election.add(new Candidate("Mickey Jones",3000));
        election.add(new Candidate("Rebecca Morgan",2000));
        election.add(new Candidate("Kathleen Turner",8000));
        election.add(new Candidate("Tory Parker",500));
        election.add(new Candidate("Ashton Davis",10000));

        printVotes(election);
        System.out.println();
        printResults(election);
        replaceName(election,"Michael Duffy","John Elmos");
        System.out.println();
        printResults(election);
        replaceVotes(election,"Mickey Jones",2500);
        System.out.println();
        printResults(election);
        replaceCandidate(election,"Kathleen Turner","John Kennedy",8500);
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
    public static void replaceName(List<Candidate> in, String oldName, String newName){
        for(int i=0; i < in.size(); i++){
            if(in.get(i).toString().equals(oldName)){
                in.set(i,new Candidate(newName,in.get(i).getNumVotes()));
            }
        }
    }
    public static void replaceVotes(List<Candidate> in, String name, int newVotes){
        for(int i=0; i < in.size(); i++){
            if(in.get(i).toString().equals(name)){
                in.set(i,new Candidate(in.get(i).toString(),newVotes));
            }
        }
    }
    public static void replaceCandidate(List<Candidate> in, String oldName, String newName, int newVotes){
        for(int i=0; i < in.size(); i++){
            if(in.get(i).toString().equals(oldName)){
                in.set(i,new Candidate(newName,newVotes));
            }
        }
    }
}