public class MyEnglish extends Homework{
    public MyEnglish(){
        super();
    }
    
    public void createAssignment(int p){
        setPages(p);
        setTypeHomework("English");
    }
    public String toString(){
        return getTypeHomework()+" - must read "+getPages()+" pages.";
    }
}