public class Student{
    private String name;
    private int qz1, qz2, qz3, qz4, qz5;
    private int[] quizzes = new int[]{qz1, qz2, qz3, qz4, qz5};
    
    public Student(String n){
        name = n;
    }
    
    public void setQuiz(int num, int val){
        quizzes[num-1] = val;
    }
    
    public int getQuiz(int num){
        return quizzes[num-1];
    }
    
    public String toString(){
        return name;
    }
}