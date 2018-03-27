public class Music2{
    private String title, singer;
    private int year;
    
    public Music2(String title, int year, String singer){
        this.title = title;
        this.year = year;
        this.singer = singer;
    }
    
    public String getTitle(){
        return title;
    }
    public int getYear(){
        return year;
    }
    public String getSinger(){
        return singer;
    }
    public String toString(){
        return title+", "+year+", "+singer;
    }
}