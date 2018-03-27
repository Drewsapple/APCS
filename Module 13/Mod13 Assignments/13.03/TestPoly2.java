/**
 * Tester class for Circle and its subclasses
 * @author Drew Fisher
 * @version 4/20/16
 */ 
public class TestPoly2{
    public static void main(String[] args){
        Circle2 c1 = new Circle2(2,4,3);
        Circle2 c2 = new Cylinder2(10,15,3,10);
        Circle2 c3 = new Oval2(25,10,4,5);
        Circle2 c4 = new OvalCylinder2(40,10,4,5,10);
        
        showCenter(c1);
        showCenter(c2);
        showCenter(c3);
        showCenter(c4);
    }
    public static void showCenter(Circle2 in){
        System.out.println("For"+in.toString()+in.center());
    }
}