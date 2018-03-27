/**
 * Uses superclasses for triangles.
 * @author Drew Fisher
 * @version 4/4/16
 */
public class TestTriangles
{
	public static void main (String []args)
	{
		Triangle a = new Triangle(3,4,5);
	    Triangle b = new Equilateral(2);
	    Triangle c = new IsoscelesRight(3);
	    System.out.println("Triangle has these lengths: A: " + a.getSideA() + "   B: " + a.getSideB() + "   C: " +a.getSideC());
	    System.out.println("Equilateral triangle has these lengths: A: " + b.getSideA() + "   B: " + b.getSideB() + "   C: " +b.getSideC());
	    System.out.println("Isosceles right triangle has these lengths: A: " + c.getSideA() + "   B: " + c.getSideB() + "   C: " +c.getSideC());
	}
	
}