/**
 * GradesV2 averages grades of students.
 * 
 * @author Drew Fisher
 * @version 10/7/15
 */
public class GradesV2
{
    public static void main(String[ ] args)
    {
        //local variables
        int numTests = 0;       //counts number of tests
        int testGrade = 0;      //individual test grade
        int totalPoints = 0;    //total points for all tests
        double average = 0.0;   //average grade   
        
        // first score
        testGrade = 97;
        totalPoints += testGrade;
        numTests ++;
        average = (double)totalPoints/numTests;
        System.out.println("n = "+numTests+"   New Test Grade: "+testGrade+"  Total Points: "+totalPoints+"  Average Score: "+average);
        
        // second score
        testGrade = 79;
        totalPoints += testGrade;
        numTests ++;
        average = (double)totalPoints/numTests;
        System.out.println("n = "+numTests+"   New Test Grade: "+testGrade+"  Total Points: "+totalPoints+"  Average Score: "+average);
        
        // third score
        testGrade = 83;
        totalPoints += testGrade;
        numTests ++;
        average = (double)totalPoints/numTests;
        System.out.println("n = "+numTests+"   New Test Grade: "+testGrade+"  Total Points: "+totalPoints+"  Average Score: "+average);
        
        // fourth score
        testGrade = 88;
        totalPoints += testGrade;
        numTests ++;
        average = (double)totalPoints/numTests;
        System.out.println("n = "+numTests+"   New Test Grade: "+testGrade+"  Total Points: "+totalPoints+"  Average Score: "+average);
        
        // first extra score
        testGrade = 100;
        totalPoints += testGrade;
        numTests ++;
        average = (double)totalPoints/numTests;
        System.out.println("n = "+numTests+"   New Test Grade: "+testGrade+"  Total Points: "+totalPoints+"  Average Score: "+average);
        
        // second extra score
        testGrade = 63;
        totalPoints += testGrade;
        numTests ++;
        average = (double)totalPoints/numTests;
        System.out.println("n = "+numTests+"   New Test Grade: "+testGrade+"  Total Points: "+totalPoints+"  Average Score: "+average);
        
        // third extra score
        testGrade = 81;
        totalPoints += testGrade;
        numTests ++;
        average = (double)totalPoints/numTests;
        System.out.println("n = "+numTests+"   New Test Grade: "+testGrade+"  Total Points: "+totalPoints+"  Average Score: "+average);
        
        // fourth extra score
        testGrade = 27;
        totalPoints += testGrade;
        numTests ++;
        average = (double)totalPoints/numTests;
        System.out.println("n = "+numTests+"   New Test Grade: "+testGrade+"  Total Points: "+totalPoints+"  Average Score: "+average);


    }
}
