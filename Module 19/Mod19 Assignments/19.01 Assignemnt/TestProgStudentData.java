/**
 * This is the tester for error handling and throwing exceptions. 
 * @author Drew Fisher
 * @version 6/10/16
*/ 
public class TestProgStudentData{
    public static void main(String[] args){
        StudentData p1 = new StudentData("John","Doe",new double[]{87.5,93.0,74.5,85.2,90.0});
        System.out.println(p1.toString());
        StudentData p2 = new StudentData("Jane","Doe",new double[]{83.5,95.0,91.2,85.2,98.4});
        System.out.println(p2.toString());
    }
}