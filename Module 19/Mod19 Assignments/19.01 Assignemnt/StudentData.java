public class StudentData{
    private String firstName, lastName;
    private double[] testScores;
    private char grade;
    
    public StudentData(String firstName, String lastName, double[] testScores){
        if((firstName == null || lastName == null) || (firstName.equals("") || lastName.equals(""))){
            String msg="Both first and last names are required.";
            throw new IllegalArgumentException(msg);
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = testScores;
        courseGrade(testScores);
    }
    
    public String toString(){
        String out = String.format("%-10s %-10s",firstName,lastName);
        for(double score : testScores){
            out += String.format("%-5.1f",score);
        }
        out += grade;
        return out;
    }
    public void courseGrade(double[] in){
        if(in.length==0){
            String msg="Grade list can not be empty";
            throw new IllegalArgumentException(msg);
        }
        else{
            double sum = 0;
            for(double score : in){
                sum += score;
            }
            double average = sum/in.length;
            if (average>=90){
                grade='A';
            }
            else if(average>=80){
                grade='B';
            }
            else if(average>=70){
                grade='C';
            }
            else if(average>=60){
                grade='D';
            }
            else{
                grade='F';
            }
        }
    }
}