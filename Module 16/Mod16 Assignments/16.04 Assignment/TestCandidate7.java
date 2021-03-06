import java.util.*;
/**
 * Tester class using arrays
 * @author Drew Fisher
 * @version 6/11/16
*/
public class TestCandidate7{
    public static void main(String[] args){
        Candidate[] election = {
            new Candidate("John Smith",5000),
            new Candidate("Mary Miller",4000),
            new Candidate("Michael Duffy",6000),
            new Candidate("Tim Robinson",2500),
            new Candidate("Joe Ashtony",1800),
            new Candidate("Mickey Jones",3000),
            new Candidate("Rebecca Morgan",2000),
            new Candidate("Kathleen Turner",8000),
            new Candidate("Tory Parker",500),
            new Candidate("Ashton Davis",10000)
        };
        printResults(election);
        deleteByLoc(election,6);
        printResults(election);
        deleteByName(election, "Kathleen Turner");
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
            if(in[i] != null){
                votes += in[i].getNumVotes();
            }
        }
        return votes;
    }
    public static void printResults(Candidate[] in){
        System.out.printf("%-20s %-20s %-20s %n","Name","Number of Votes","Percentage of Votes");
        for(int i=0; i < in.length; i++){
            if(in[i] != null){
                double percent = 100*in[i].getNumVotes()/(double)getTotal(in);
                System.out.printf("%-20s %-20s %2.2f%% %n",in[i].toString(),in[i].getNumVotes(),percent);
            }
        }
        System.out.println();
        System.out.println("Total number of votes in election: "+getTotal(in));
    }
    public static void replaceName(Candidate[] in, String oldName, String newName){
        for(int i=0; i < in.length; i++){
            if(in[i].toString().equals(oldName)){
                in[i] = new Candidate(newName,in[i].getNumVotes());
            }
        }
    }
    public static void replaceVotes(Candidate[] in, String name, int newVotes){
        for(int i=0; i < in.length; i++){
            if(in[i].toString().equals(name)){
                in[i] = new Candidate(in[i].toString(),newVotes);
            }
        }
    }
    public static void replaceCandidate(Candidate[] in, String oldName, String newName, int newVotes){
        for(int i=0; i < in.length; i++){
            if(in[i].toString().equals(oldName)){
                in[i] = new Candidate(newName,newVotes);
            }
        }
    }
    public static void insertPosition(Candidate[] in, int pos, String newName, int newVotes){
        for(int i = in.length - 1; i > pos; i--)
        {
            in[i] = in[i-1]; 
        }
        
        in[pos]=new Candidate(newName,newVotes);
    }
    public static void insertCandiadate(Candidate[] in, String oldName, String newName, int newVotes){
        int pos = 0;
        for(int i = 0; i < in.length; i++)
        {
            if(in[i].toString().equals(oldName)){
                pos = i;
            }
        }
        for(int i = in.length - 1; i > pos; i--)
        {
            in[i] = in[i-1]; 
        }
        
        in[pos]=new Candidate(newName,newVotes);
    }
    public static void deleteByLoc(Candidate[] in, int pos){
        if ((pos > 0) && (pos < in.length)){
            for(int i = pos; i < in.length -1; i++){
                in[i] = in[i + 1];
            }
            in[in.length-1] = null;
        }
    }
    public static void deleteByName(Candidate[] in, String name){
        for(int i = 0; i < in.length; i++){
            if(in[i].toString().equals(name)){
                in[i]=null;
                break;
            }
            else if(in[i] == null){
                break;
            }
        }
    }
}