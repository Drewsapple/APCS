public class MyJava extends Homework{
    public MyJava(){
        super();
    }
    
    public void createAssignment(int p){
        setPages(p);
        setTypeHomework("Java");
    }
    public String toString(){
        return getTypeHomework()+" - must read "+getPages()+" pages.";
    }
}