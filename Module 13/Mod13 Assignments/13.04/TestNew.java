/**
 * Tester class for Rectangles, Boxes, and Cubes.
 * @author Drew Fisher
 * @version 4/25/16
 */ 
public class TestNew{
    public static void main(String[] args){
        Rectangle3 a = new Rectangle3(5,20);
        Box3 b = new Box3(2,1,6);
        Box3 c = new Box3(8,8,8);
        Cube3 d = new Cube3(8);
	   
	    showEffectBoth(a);
	    showEffectBoth(b);
	    showEffectBoth(c);
	    showEffectBoth(d);
	      
	    System.out.println(a.equals(b));
	    System.out.println(c.equals(d));
    }
    public static void showEffectBoth(Rectangle3 r){
        System.out.println(r);
    }
}