public class Movie4 implements Comparable<Movie4>{
    private String title, studio;
    private int year, sortBy;
    
    Movie4(String t, int y,String s){
        title = t;
        year = y;
        studio = s;
    }
    public String getTitle(){
        return title;
    }
    public String getStudio(){
        return studio;
    }
    public int getYear(){
        return year;
    }
    public void setSort(int sortBy){
        this.sortBy = sortBy;
    }
    public int getSort(){
        return sortBy;
    }
    
    public String toString(){
        return title+", "+year+", "+studio;
    }
    public int compareTo(Movie4 in){
        int diff = 0;
        if(sortBy == 0){
            diff = this.getTitle().compareTo(in.getTitle());
        }
        else if(sortBy == 1){
            diff = this.getStudio().compareTo(in.getStudio());
        }
        return diff;
    }
    
}