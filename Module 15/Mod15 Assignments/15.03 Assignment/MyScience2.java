public class MyScience2 extends Homework2{
    public MyScience2(){
        super();
    }
    
    public void createAssignment(int p){
        setPages(p);
        setTypeHomework("Science");
    }
    public String toString(){
        return getTypeHomework()+" - must read "+getPages()+" pages.";
    }
    public void doReading(){
        setPages(getPages()-3);
    }
}