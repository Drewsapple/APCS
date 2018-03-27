public class MyEnglish2 extends Homework2{
    public MyEnglish2(){
        super();
    }
    
    public void createAssignment(int p){
        setPages(p);
        setTypeHomework("English");
    }
    public String toString(){
        return getTypeHomework()+" - must read "+getPages()+" pages.";
    }
    public void doReading(){
        setPages(getPages()-1);
    }
}