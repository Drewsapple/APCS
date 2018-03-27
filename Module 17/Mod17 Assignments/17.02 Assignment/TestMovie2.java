/**
 * Tester class for the insertion sort.
 * @author Drew Fisher
 * @version 6/6/16
*/ 
public class TestMovie2{
    public static void printMovies(Movie2[] in){
        for(Movie2 movie : in){
            System.out.println(movie.toString());
        }
    }
    public static Movie2[] sortTitles(Movie2[] in, int dir){
        Movie2[] newOrder = new Movie2[in.length];
        for(int i = 0; i < in.length; i++){
            int insertAt = 0;
            Movie2 curr = in[i];
            int spot = i;
            curr.setSort(0);
            while(insertAt == 0 && spot >= 1){
                if(dir==1){
                    if(curr.compareTo(newOrder[spot-1]) > 0){
                        insertAt = spot;
                    }
                    else{
                        newOrder[spot] = newOrder[spot - 1];
                    }
                    spot -= 1;
                }
                else{
                    if(curr.compareTo(newOrder[spot-1]) < 0){
                        insertAt = spot;
                    }
                    else{
                        newOrder[spot] = newOrder[spot + 1];
                    }
                    spot -= 1;
                }
            }
            newOrder[insertAt] = curr;
        }
        return newOrder;
    }
    public static Movie2[] sortYear(Movie2[] in, int dir){
        Movie2[] newOrder = new Movie2[in.length];
        for(int i = 0; i < in.length; i++){
            int insertAt = 0;
            Movie2 curr = in[i];
            int spot = i;
            curr.setSort(0);
            while(insertAt == 0 && spot >= 1){
                if(dir==1){
                    if(curr.getYear() > newOrder[spot-1].getYear()){
                        insertAt = spot;
                    }
                    else{
                        newOrder[spot] = newOrder[spot - 1];
                    }
                    spot -= 1;
                }
                else{
                    if(curr.getYear() < newOrder[spot-1].getYear()){
                        insertAt = spot;
                    }
                    else{
                        newOrder[spot] = newOrder[spot - 1];
                    }
                    spot -= 1;
                }
            }
            newOrder[insertAt] = curr;
        }
        return newOrder;
    }
    
    public static Movie2[] sortStudios(Movie2[] in, int dir){
        Movie2[] newOrder = new Movie2[in.length];
        for(int i = 0; i < in.length; i++){
            int insertAt = 0;
            Movie2 curr = in[i];
            int spot = i;
            curr.setSort(1);
            while(insertAt == 0 && spot >= 1){
                if(dir==1){
                    if(curr.compareTo(newOrder[spot-1]) > 0){
                        insertAt = spot;
                    }
                    else{
                        newOrder[spot] = newOrder[spot - 1];
                    }
                    spot -= 1;
                }
                else{
                    if(curr.compareTo(newOrder[spot-1]) < 0){
                        insertAt = spot;
                    }
                    else{
                        newOrder[spot] = newOrder[spot + 1];
                    }
                    spot -= 1;
                }
            }
            newOrder[insertAt] = curr;
        }
        return newOrder;
    }
    
    public static void main(String[] args){
        Movie2[] myMovies = new Movie2[10];
        myMovies[0] = new Movie2("The Muppets Take Manhattan", 2001, "Columbia Tristar");
        myMovies[1] = new Movie2("Mulan Special Edition", 2004, "Disney");
        myMovies[2] = new Movie2("Shrek 2", 2004, "Dreamworks");
        myMovies[3] = new Movie2("The Incredibles", 2004, "Pixar");
        myMovies[4] = new Movie2("Nanny McPhee", 2006, "Universal");
        myMovies[5] = new Movie2("The Curse of the Were-Rabbit", 2006, "Universal");
        myMovies[6] = new Movie2("Ice Age", 2002, "20th Century Fox");
        myMovies[7] = new Movie2("Lilo & Stitch", 2002, "Disney");
        myMovies[8] = new Movie2("Robots", 2005, "20th Century Fox");
        myMovies[9] = new Movie2("Monsters Inc.", 2001, "Pixar");
        
        System.out.println("Before Sorting:");
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sorted by Title - ascending:");
        myMovies = sortTitles(myMovies, 1);
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sorted by Year - descending:");
        myMovies = sortYear(myMovies, 2);
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sorted by Studio - ascending:");
        myMovies = sortStudios(myMovies, 1);
        printMovies(myMovies);
        System.out.println();
    }
}