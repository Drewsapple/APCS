/**
 * Tester class for the merge sort.
 * @author Drew Fisher
 * @version 6/7/16
*/ 
public class TestMovie4{
    public static void printMovies(Movie4[] in){
        for(Movie4 movie : in){
            System.out.println(movie.toString());
        }
    }
    public static Movie4[] sortTitles(Movie4[] in, int low, int high){
        if(low == high){
            return in;
        }
        int mid = (high + low)/2;
        sortTitles(in, low, mid);
        sortTitles(in, mid+1, high);
        mergeTitles(in, low, mid, high);
        return in;
    }
    public static Movie4[] sortYear(Movie4[] in, int low, int high){
        if(low == high){
            return in;
        }
        int mid = (high + low)/2;
        sortYear(in, low, mid);
        sortYear(in, mid+1, high);
        mergeYear(in, low, mid, high);
        return in;
    }
    public static Movie4[] sortStudios(Movie4[] in, int low, int high){
        if(low == high){
            return in;
        }
        int mid = (high + low)/2;
        sortStudios(in, low, mid);
        sortStudios(in, mid+1, high);
        mergeStudios(in, low, mid, high);
        return in;
    }
    public static void mergeTitles(Movie4[] in, int low, int mid, int high){
        Movie4[] temp = new Movie4[high-low+1];
        int i = low, j = mid + 1, n = 0;
        for(Movie4 mov : in){
            mov.setSort(0);
        }
        while(i <= mid || j <= high){
            if(i > mid){
                temp[n] = in[j];
                j++;
            }
            else if(j > high){
                temp[n] = in[i];
                i++;
            }
            else if(in[i].compareTo(in[j]) > 0){
                temp[n] = in[i];
                i++;
            }
            else{
                temp[n] =in[j];
                j++;
            }
            n++;
        }
        for(int k = low; k <= high; k++){
           in[k] = temp[k - low];
        }
    }
    public static void mergeYear(Movie4[] in, int low, int mid, int high){
        Movie4[] temp = new Movie4[high-low+1];
        int i = low, j = mid + 1, n = 0;
        while(i <= mid || j <= high){
            if(i > mid){
                temp[n] = in[j];
                j++;
            }
            else if(j > high){
                temp[n] = in[i];
                i++;
            }
            else if(in[i].getYear() > in[j].getYear()){
                temp[n] = in[i];
                i++;
            }
            else{
                temp[n] =in[j];
                j++;
            }
            n++;
        }
        for(int k = low; k <= high; k++){
           in[k] = temp[k - low];
        }
    }
    public static void mergeStudios(Movie4[] in, int low, int mid, int high){
        Movie4[] temp = new Movie4[high-low+1];
        int i = low, j = mid + 1, n = 0;
        for(Movie4 mov : in){
            mov.setSort(1);
        }
        while(i <= mid || j <= high){
            if(i > mid){
                temp[n] = in[j];
                j++;
            }
            else if(j > high){
                temp[n] = in[i];
                i++;
            }
            else if(in[i].compareTo(in[j]) < 0){
                temp[n] = in[i];
                i++;
            }
            else{
                temp[n] =in[j];
                j++;
            }
            n++;
        }
        for(int k = low; k <= high; k++){
           in[k] = temp[k - low];
        }
    }
    
    public static void main(String[] args){
        Movie4[] myMovies = new Movie4[10];
        myMovies[0] = new Movie4("The Muppets Take Manhattan", 2001, "Columbia Tristar");
        myMovies[1] = new Movie4("Mulan Special Edition", 2004, "Disney");
        myMovies[2] = new Movie4("Shrek 2", 2004, "Dreamworks");
        myMovies[3] = new Movie4("The Incredibles", 2004, "Pixar");
        myMovies[4] = new Movie4("Nanny McPhee", 2006, "Universal");
        myMovies[5] = new Movie4("The Curse of the Were-Rabbit", 2006, "Universal");
        myMovies[6] = new Movie4("Ice Age", 2002, "20th Century Fox");
        myMovies[7] = new Movie4("Lilo & Stitch", 2002, "Disney");
        myMovies[8] = new Movie4("Robots", 2005, "20th Century Fox");
        myMovies[9] = new Movie4("Monsters Inc.", 2001, "Pixar");
        
        System.out.println("Before Sorting:");
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sorted by Title - ascending:");
        myMovies = sortTitles(myMovies, 0, myMovies.length-1);
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sorted by Year - descending:");
        myMovies = sortYear(myMovies, 0, myMovies.length-1);
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sorted by Studio - ascending:");
        myMovies = sortStudios(myMovies, 0, myMovies.length-1);
        printMovies(myMovies);
        System.out.println();
    }
}