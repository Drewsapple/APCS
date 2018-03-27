/**
 * Tester class for sequential searches
 * @author Drew Fisher
 * @version 6/8/16
*/
public class TestMusic{
    public static void main(String[] args){
        Music[] myMusic ={
            new Music("Pieces of You", 1994, "Jewel"),
            new Music("Jagged Little Pill", 1995, "Alanis Morisette"),
            new Music("What If It's You", 1995, "Reba McEntire"),
            new Music("Misunderstood", 2001, "Pink"),
            new Music("Laundry Service", 2001, "Shakira"),
            new Music("Taking the Long Way",2006, "Dixie Chicks"),
            new Music("Under My Skin", 2004, "Avril Lavigne"),
            new Music("Let Go", 2002, "Avril Lavigne"),
            new Music("Let It Go",2007,"Tim McGraw"),
            new Music("White Flag", 2004, "Dido")};
            
            printMusic(myMusic);
            searchTitle(myMusic, "Let Go");
            System.out.println();
            searchTitle(myMusic, "Some Day");
            System.out.println();
            searchYear(myMusic, 2001);
            System.out.println();
            searchYear(myMusic, 2003);
            System.out.println();
            searchSinger(myMusic, "Avril Lavigne");
            System.out.println();
            searchSinger(myMusic, "Tony Curtis");
    }
    public static void printMusic(Music[] in){
        System.out.println("Music Library:");
        System.out.println("--------------");
        System.out.printf("%-20s %-5s %-15s \n", "Title", "Year", "Singer");
        for(Music obj : in){
            System.out.printf("%-20s %-5s %-15s \n", obj.getTitle(), obj.getYear(), obj.getSinger());
        }
        System.out.println();
    }
    public static void searchTitle(Music[] in, String lookFor){
        int numFound=0;
        System.out.println("Search - Title - " +lookFor);
        for(int i = 0; i < in.length; i++){
            if(in[i].getTitle().equalsIgnoreCase(lookFor)){
                numFound++;
                System.out.println(in[i]);
            }
        }
        if(numFound != 0){
            System.out.println("Total Instances Found: "+numFound);
        }
        else{
            System.out.println("There are no lisitngs for " + lookFor);
        }
    }
    public static void searchYear(Music[] in, int lookFor){
        int numFound=0;
        System.out.println("Search - Year - " +lookFor);
        for(int i = 0; i < in.length; i++){
            if(in[i].getYear() == lookFor){
                numFound++;
                System.out.println(in[i]);
            }
        }
        if(numFound != 0){
            System.out.println("Total Instances Found: "+numFound);
        }
        else{
            System.out.println("There are no lisitngs for " + lookFor);
        }
    }
    public static void searchSinger(Music[] in, String lookFor){
        int numFound=0;
        System.out.println("Search - Singer - " +lookFor);
        for(int i = 0; i < in.length; i++){
            if(in[i].getSinger().equalsIgnoreCase(lookFor)){
                numFound++;
                System.out.println(in[i]);
            }
        }
        if(numFound != 0){
            System.out.println("Total Instances Found: "+numFound);
        }
        else{
            System.out.println("There are no lisitngs for " + lookFor);
        }
    }
}