import java.util.ArrayList;
/**
 * Tests homework classes and displays result.
 * @author Drew Fisher
 * @version 5/11/16
*/ 
public class Tester{
    public static void main(String[] args){
        ArrayList<Homework> assignments = new ArrayList<Homework>();
        assignments.add(new MyMath());
        assignments.add(new MyScience());
        assignments.add(new MyEnglish());
        assignments.add(new MyJava());
        
        assignments.get(0).createAssignment(2);
        assignments.get(1).createAssignment(4);
        assignments.get(2).createAssignment(73);
        assignments.get(3).createAssignment(3);
        
        for (int i = 0; i < assignments.size(); i++){
            System.out.println(assignments.get(i).toString());
        }
    }
}