/**
 * Tester class for the selection sort.
 * @author Drew Fisher
 * @version 6/7/16
*/ 
public class TestMovie3{
    public static void printMovies(Movie3[] in){
        for(Movie3 movie : in){
            System.out.println(movie.toString());
        }
    }
    public static Movie3[] sortTitles(Movie3[] in, int dir){
        int k;
        int posmax;
        Movie3 temp;
        
        for(int i = in.length - 1; i >= 0; i--){
            posmax = 0;
            in[i].setSort(0);
            for(k = 0; k <= i; k++){
                if(dir == 1){
                    if(in[k].compareTo(in[posmax]) > 0){
                        posmax = k;
                    }
                }
                else if(dir == 2){
                    if(in[k].compareTo(in[posmax]) < 0){
                        posmax = k;
                    }
                }
                temp = in[i];
                in[i] = in[posmax];
                in[posmax] = temp;
            }
        }
        return in;
    }
    public static Movie3[] sortYear(Movie3[] in, int dir){
        int k;
        int posmax;
        Movie3 temp;
        
        for(int i = in.length - 1; i >= 0; i--){
            posmax = 0;
            for(k = 0; k <= i; k++){
                if(dir == 1){
                    if(in[k].getYear() > in[posmax].getYear()){
                        posmax = k;
                    }
                }
                else if(dir == 2){
                    if(in[k].getYear() < in[posmax].getYear()){
                        posmax = k;
                    }
                }
                temp = in[i];
                in[i] = in[posmax];
                in[posmax] = temp;
            }
        }
        return in;
    }
    public static Movie3[] sortStudios(Movie3[] in, int dir){
        int k;
        int posmax;
        Movie3 temp;
        
        for(int i = in.length - 1; i >= 0; i--){
            posmax = 0;
            in[i].setSort(1);
            for(k = 0; k <= i; k++){
                if(dir == 1){
                    if(in[k].compareTo(in[posmax]) > 0){
                        posmax = k;
                    }
                }
                else if(dir == 2){
                    if(in[k].compareTo(in[posmax]) < 0){
                        posmax = k;
                    }
                }
                temp = in[i];
                in[i] = in[posmax];
                in[posmax] = temp;
            }
        }
        return in;
    }
    
    public static void main(String[] args){
        Movie3[] myMovies = new Movie3[10];
        myMovies[0] = new Movie3("The Muppets Take Manhattan", 2001, "Columbia Tristar");
        myMovies[1] = new Movie3("Mulan Special Edition", 2004, "Disney");
        myMovies[2] = new Movie3("Shrek 2", 2004, "Dreamworks");
        myMovies[3] = new Movie3("The Incredibles", 2004, "Pixar");
        myMovies[4] = new Movie3("Nanny McPhee", 2006, "Universal");
        myMovies[5] = new Movie3("The Curse of the Were-Rabbit", 2006, "Universal");
        myMovies[6] = new Movie3("Ice Age", 2002, "20th Century Fox");
        myMovies[7] = new Movie3("Lilo & Stitch", 2002, "Disney");
        myMovies[8] = new Movie3("Robots", 2005, "20th Century Fox");
        myMovies[9] = new Movie3("Monsters Inc.", 2001, "Pixar");
        
        System.out.println("Before Sorting:");
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sorted by Title - descending:");
        myMovies = sortTitles(myMovies, 2);
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