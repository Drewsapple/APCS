/**
 * Tester class for binary searches
 * @author Drew Fisher
 * @version 6/8/16
*/
public class TestMusic2{
    public static void main(String[] args){
        Music2[] myMusic ={
            new Music2("Pieces of You", 1994, "Jewel"),
            new Music2("Jagged Little Pill", 1995, "Alanis Morisette"),
            new Music2("What If It's You", 1995, "Reba McEntire"),
            new Music2("Misunderstood", 2001, "Pink"),
            new Music2("Laundry Service", 2001, "Shakira"),
            new Music2("Taking the Long Way",2006, "Dixie Chicks"),
            new Music2("Under My Skin", 2004, "Avril Lavigne"),
            new Music2("Let Go", 2002, "Avril Lavigne"),
            new Music2("Let It Go",2007,"Tim McGraw"),
            new Music2("White Flag", 2004, "Dido")};
            
            printMusic(myMusic);
            Music2[] sorted = selectionSortTitles(myMusic);
            searchTitle(sorted,"Misunderstood");
            searchTitle(sorted,"Under Paid");
            sorted = selectionSortYears(myMusic);
            searchYear(sorted, 2005);
            searchYear(sorted, 2006);
            sorted = selectionSortSingers(myMusic);
            searchSinger(sorted, "Darth Maul");
            searchSinger(sorted, "Dido");
    }
    public static void printMusic(Music2[] in){
        System.out.println("Music Library:");
        System.out.println("--------------");
        System.out.printf("%-20s %-5s %-15s \n", "Title", "Year", "Singer");
        for(Music2 obj : in){
            System.out.printf("%-20s %-5s %-15s \n", obj.getTitle(), obj.getYear(), obj.getSinger());
        }
        System.out.println();
    }
    public static Music2[] selectionSortTitles(Music2[] in){
        int k;
        int posmax;
        Music2 temp;
        
        for(int i = in.length - 1; i >= 0; i--){
            posmax = 0;
            for(k = 0; k <= i; k++){
                if(in[k].getTitle().compareTo(in[posmax].getTitle()) > 0){
                    posmax = k;
                }
                temp = in[i];
                in[i] = in[posmax];
                in[posmax] = temp;
            }
        }
        return in;
    }
    public static Music2[] selectionSortYears(Music2[] in){
        int k;
        int posmax;
        Music2 temp;
        
        for(int i = in.length - 1; i >= 0; i--){
            posmax = 0;
            for(k = 0; k <= i; k++){
                if(in[k].getYear() > in[posmax].getYear()){
                    posmax = k;
                }
                temp = in[i];
                in[i] = in[posmax];
                in[posmax] = temp;
            }
        }
        return in;
    }
    public static Music2[] selectionSortSingers(Music2[] in){
        int k;
        int posmax;
        Music2 temp;
        
        for(int i = in.length - 1; i >= 0; i--){
            posmax = 0;
            for(k = 0; k <= i; k++){
                if(in[k].getSinger().compareTo(in[posmax].getSinger()) > 0){
                    posmax = k;
                }
                temp = in[i];
                in[i] = in[posmax];
                in[posmax] = temp;
            }
        }
        return in;
    }
    public static void searchTitle(Music2[] in, String lookFor){
        System.out.println("Search - Title - " +lookFor);
        int high = in.length;
        int low = -1;
        int probe;
        while ( high - low > 1 ){
            probe = ( high + low ) / 2;
            if(in[probe].getTitle().compareTo(lookFor) > 0){
                high = probe;
            }
            else{
                low = probe;
                if(in[probe].getTitle().compareTo(lookFor) == 0){
                    break;
                }
            }
        }
        if((low >= 0) && (in[low].getTitle().compareTo(lookFor) == 0 )){
            System.out.println(in[low]);
        }
        else{
            System.out.println("Not found.");
        }
    }
    public static void searchYear(Music2[] in, int lookFor){
        System.out.println("Search - Year - " +lookFor);
        int high = in.length;
        int low = -1;
        int probe;
        while ( high - low > 1 ){
            probe = ( high + low ) / 2;
            if(in[probe].getYear() > lookFor){
                high = probe;
            }
            else{
                low = probe;
                if(in[probe].getYear() == lookFor){
                    break;
                }
            }
        }
        if((low >= 0) && (in[low].getYear() == lookFor)){
            System.out.println(in[low]);
        }
        else{
            System.out.println("Not found.");
        }
    }
    public static void searchSinger(Music2[] in, String lookFor){
        System.out.println("Search - Singer - " +lookFor);
        int high = in.length;
        int low = -1;
        int probe;
        while ( high - low > 1 ){
            probe = ( high + low ) / 2;
            if(in[probe].getSinger().compareTo(lookFor) > 0){
                high = probe;
            }
            else{
                low = probe;
                if(in[probe].getSinger().compareTo(lookFor) == 0){
                    break;
                }
            }
        }
        if((low >= 0) && (in[low].getSinger().compareTo(lookFor) == 0 )){
            System.out.println(in[low]);
        }
        else{
            System.out.println("Not found.");
        }
    }
}