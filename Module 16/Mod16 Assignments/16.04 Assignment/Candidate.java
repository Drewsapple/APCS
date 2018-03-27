public class Candidate{
    String name = "";
    int numVotes = 0;
    
    public Candidate(String n, int v){
        name = n;
        numVotes = v;
    }
    public String toString(){
        return name;
    }
    public int getNumVotes(){
        return numVotes;
    }
}