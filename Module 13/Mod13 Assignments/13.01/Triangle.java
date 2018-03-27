/**
 * Uses superclasses for triangles.
 * @author Drew Fisher
 * @version 4/4/16
 */
public class Triangle{
    private double sideA, sideB, sideC;
    
    Triangle(double s1, double s2, double s3){
        sideA = s1;
        sideB = s2;
        sideC = s3;
    }
    public double getSideA(){
        return sideA;
    }
    public double getSideB(){
        return sideB;
    }
    public double getSideC(){
        return sideC;
    }
}