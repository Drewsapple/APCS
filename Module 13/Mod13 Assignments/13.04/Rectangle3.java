/**
 * Rectangle2 demo
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/6/2007
 */
public class Rectangle3
{
	// instance variables 
	private int length;
	private int width;

	/**
	 * Constructor for objects of class rectangle
	 */
	public Rectangle3(int l, int w)
	{
		// initialise instance variables
		length = l;
		width = w;
	}
	public int getLength()
	{
		return length;
	}
	public int getWidth()
	{
	    return width;
	}
	
	public String toString()
	{
	    return "Rectangle3 is " + length + " X " + width;
	}
	
	public String equals(Rectangle3 r){
	    String a = Integer.toString(length)+Integer.toString(width);
	    String b = Integer.toString(r.length)+Integer.toString(r.width);
	    
	    if(b.equals(a)){
	        return "Rectangle: " + getLength() + " x " + getWidth() + " equals Rectangle: " + r.getLength() + " x " + r.getWidth();
	    }
	    else{
	        return "Rectangle: " + getLength() + " x " + getWidth() + " does not equal Rectangle: " + r.getLength() + " x " + r.getWidth();
	    }
	}
}