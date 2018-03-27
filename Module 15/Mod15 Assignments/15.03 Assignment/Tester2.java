import java.util.List;
import java.util.ArrayList;
/**
 * Tests using new homework classes
 * @author Drew Fisher
 * @version 5/11/16
*/ 
public class Tester2{
    public static void main(String[] args){
        List<Homework2> assignments = new ArrayList<Homework2>();
        assignments.add(new MyMath2());
        assignments.add(new MyScience2());
        assignments.add(new MyEnglish2());
        assignments.add(new MyJava2());
        
        assignments.get(0).createAssignment(4);
        assignments.get(1).createAssignment(5);
        assignments.get(2).createAssignment(73);
        assignments.get(3).createAssignment(6);
        
        for (int i = 0; i < assignments.size(); i++){
            System.out.println("Before reading:");
            System.out.println(assignments.get(i).toString());
            assignments.get(i).doReading();
            System.out.println("After reading:");
            System.out.println(assignments.get(i).toString());
        }
    }
}