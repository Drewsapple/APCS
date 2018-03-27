import java.util.*;
/**
 * Tester class for running through a gradebook
 * @author Drew Fisher
 * @version 6/1/16
*/

public class TestStudent{
    public static void main(String[] args){
        List<Student> myClass = new ArrayList<Student>();
        myClass.add(new Student("Mark Kennedy"));
        myClass.add(new Student("Max Gerard"));
        myClass.add(new Student("Jean Smith"));
        myClass.add(new Student("Betty Farm"));
        myClass.add(new Student("Dilbert Gamma"));
        
        myClass.get(0).setQuiz(1,70);
        myClass.get(0).setQuiz(2,80);
        myClass.get(0).setQuiz(3,90);
        myClass.get(0).setQuiz(4,100);
        myClass.get(0).setQuiz(5,90);
        
        myClass.get(1).setQuiz(1,80);
        myClass.get(1).setQuiz(2,85);
        myClass.get(1).setQuiz(3,90);
        myClass.get(1).setQuiz(4,85);
        myClass.get(1).setQuiz(5,80);
        
        myClass.get(2).setQuiz(1,50);
        myClass.get(2).setQuiz(2,79);
        myClass.get(2).setQuiz(3,89);
        myClass.get(2).setQuiz(4,99);
        myClass.get(2).setQuiz(5,100);
        
        myClass.get(3).setQuiz(1,85);
        myClass.get(3).setQuiz(2,80);
        myClass.get(3).setQuiz(3,85);
        myClass.get(3).setQuiz(4,88);
        myClass.get(3).setQuiz(5,89);
        
        myClass.get(4).setQuiz(1,70);
        myClass.get(4).setQuiz(2,70);
        myClass.get(4).setQuiz(3,90);
        myClass.get(4).setQuiz(4,70);
        myClass.get(4).setQuiz(5,80);
        
        printBook(myClass);
        System.out.println();
        System.out.println("Changing Max's name to Max Speed:");
        replaceName(myClass,"Max Gerard","Max Speed");
        System.out.println();
        printBook(myClass);
        System.out.println();
        System.out.println("Changing Jean's third quiz score to 84:");
        replaceQuiz(myClass,"Jean Smith",3,84);
        System.out.println();
        printBook(myClass);
        System.out.println();
        System.out.println("Replacing Mark with Robert Haza: 93, 98, 87, 92, 85");
        replaceStudent(myClass,"Mark Kennedy","Robert Haza", 93, 98, 87, 92, 85);
        System.out.println();
        printBook(myClass);
        System.out.println();
        System.out.println("Inserting Jane West before Robert: 95, 82, 83, 92, 88");
        insertStudent(myClass,"Robert Haza","Jane West", 95, 82, 83, 92, 88);
        System.out.println();
        printBook(myClass);
        System.out.println();
        System.out.println("Deleting Betty:");
        deleteStudent(myClass,"Betty Farm");
        System.out.println();
        printBook(myClass);
    }
    
    public static void printBook(List<Student> in){
        System.out.printf("%15s |","Name");
        for(int i = 1; i <= 5;i++){
            System.out.printf("  %3s  |","Q"+i);
        }
        System.out.println();
        
        for(int i = 0; i < in.size();i++){
            if(in.get(i) == null){
                System.out.print("");
            }
            else{
                System.out.printf("%15s |",in.get(i).toString());
                for(int c = 1; c <= 5;c++){
                    System.out.printf("  %3d  |",in.get(i).getQuiz(c));
                }
                System.out.println();
            }
        }
    }
    
    public static void replaceName(List<Student> in, String oldName, String newName){
        for(int i=0; i < in.size(); i++){
            if(in.get(i).toString().equals(oldName)){
                int[] oldQuiz = new int[5];
                for(int c = 1; c <= 5;c++){
                    oldQuiz[c-1] = in.get(i).getQuiz(c);
                }
                in.set(i,new Student(newName));
                for(int c = 1; c <= 5;c++){
                    in.get(i).setQuiz(c,oldQuiz[c-1]);
                }
            }
        }
    }
    
    public static void replaceQuiz(List<Student> in, String oldName, int quizNum, int newVal){
        for(int i=0; i < in.size(); i++){
            if(in.get(i).toString().equals(oldName)){
                in.get(i).setQuiz(quizNum,newVal);
            }
        }
    }
    
    public static void replaceStudent(List<Student> in, String oldName, String newName, int qz1, int qz2, int qz3, int qz4, int qz5){
        for(int i=0; i < in.size(); i++){
            if(in.get(i).toString().equals(oldName)){
                in.set(i,new Student(newName));
                
                in.get(i).setQuiz(1,qz1);
                in.get(i).setQuiz(2,qz2);
                in.get(i).setQuiz(3,qz3);
                in.get(i).setQuiz(4,qz4);
                in.get(i).setQuiz(5,qz5);
            }
        }
    }
    
    public static void insertStudent(List<Student> in, String oldName, String newName, int qz1, int qz2, int qz3, int qz4, int qz5){
        int pos = 0;
        for(int i = 0; i < in.size(); i++){
            if(in.get(i).toString().equals(oldName)){
                pos = i;
            }
        }
        in.add(pos, new Student(newName));
        in.get(pos).setQuiz(1,qz1);
        in.get(pos).setQuiz(2,qz2);
        in.get(pos).setQuiz(3,qz3);
        in.get(pos).setQuiz(4,qz4);
        in.get(pos).setQuiz(5,qz5);
    }
    
    public static void deleteStudent(List<Student> in, String oldName){
        for(int i = 0; i < in.size(); i++){
            if(in.get(i).toString().equals(oldName)){
                in.remove(i);
            }
        }
    }
}