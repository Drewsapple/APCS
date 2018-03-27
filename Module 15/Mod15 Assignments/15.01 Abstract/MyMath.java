public class MyMath extends Homework{
    public MyMath(){
        super();
    }
    
    public void createAssignment(int p){
        setPages(p);
        setTypeHomework("Math");
    }
    public String toString(){
        return getTypeHomework()+" - must read "+getPages()+" pages.";
    }
}