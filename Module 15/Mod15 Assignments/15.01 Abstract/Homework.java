public abstract class Homework{
    private int pagesRead;
    private String typeHomework;
    
    public Homework(){
        pagesRead = 0;
        typeHomework = "none";
    }
    
    public void setPages(int p){
        pagesRead = p;
    }
    public int getPages(){
        return pagesRead;
    }
    public void setTypeHomework(String t){
        typeHomework = t;
    }
    public String getTypeHomework(){
        return typeHomework;
    }
    public void createAssignment(int p){
    }
}