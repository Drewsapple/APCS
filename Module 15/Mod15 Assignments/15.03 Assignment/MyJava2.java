public class MyJava2 extends Homework2{
    public MyJava2(){
        super();
    }
    
    public void createAssignment(int p){
        setPages(p);
        setTypeHomework("Java");
    }
    public String toString(){
        return getTypeHomework()+" - must read "+getPages()+" pages.";
    }
    public void doReading(){
        setPages(getPages()-4);
    }
}