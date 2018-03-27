/**
 * Box2 demo.
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Box3 extends Rectangle3
{
	// instance variables 
	private int height;

	/**
	 * Constructor for objects of class box
	 */
	public Box3(int l, int w, int h)
	{
		// call superclass
		super(l, w);
	    // initialise instance variables
		height = h;
	}

	// return the height
	public int getHeight()
	{
		return height;
	}
	
	public String toString()
	{
	    return "Box3 is " + getLength() + " x " + getWidth() + " x " + height;
	}

    public String equals(Box3 b1){
        String a = Integer.toString(getLength())+Integer.toString(getWidth())+Integer.toString(getHeight());
	    String b = Integer.toString(b1.getLength())+Integer.toString(b1.getWidth())+Integer.toString(b1.getHeight());
	    
	    if(b.equals(a)){
	        return "Box: " + getLength() + " x " + getWidth() + " x " + getHeight() + " equals Box: " + b1.getLength() + " x " + b1.getWidth() + " x " + b1.getHeight();
	    }
	    else{
	        return "Box: " + getLength() + " x " + getWidth() + " x " + getHeight() + " does not equal Box: " + b1.getLength() + " x " + b1.getWidth() + " x " + b1.getHeight();
	    }
    }
}