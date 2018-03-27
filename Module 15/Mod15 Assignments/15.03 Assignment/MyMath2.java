public class MyMath2 extends Homework2{
    public MyMath2(){
        super();
    }
    
    public void createAssignment(int p){
        setPages(p);
        setTypeHomework("Math");
    }
    public String toString(){
        return getTypeHomework()+" - must read "+getPages()+" pages.";
    }
    public void doReading(){
        setPages(getPages()-2);
    }
}