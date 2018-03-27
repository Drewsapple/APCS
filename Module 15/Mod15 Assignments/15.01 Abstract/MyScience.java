public class MyScience extends Homework{
    public MyScience(){
        super();
    }
    
    public void createAssignment(int p){
        setPages(p);
        setTypeHomework("Science");
    }
    public String toString(){
        return getTypeHomework()+" - must read "+getPages()+" pages.";
    }
}