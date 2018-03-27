/**
 * Uses superclasses for cubes and boxes.
 * @author Drew Fisher
 * @version 4/4/16
 */
public class Cube3 extends Box3{
    public Cube3(int s){
        super(s,s,s);
    }
    public String equals(Cube3 c){
        String a = Integer.toString(getLength())+Integer.toString(getWidth())+Integer.toString(getHeight());
	    String b = Integer.toString(c.getLength())+Integer.toString(c.getWidth())+Integer.toString(c.getHeight());
	    
	    if(b.equals(a)){
	        return "Box: " + getLength() + " x " + getWidth() + " x " + getHeight() + " equals Box: " + c.getLength() + " x " + c.getWidth() + " x " + c.getHeight();
	    }
	    else{
	        return "Box: " + getLength() + " x " + getWidth() + " x " + getHeight() + " does not equal Box: " + c.getLength() + " x " + c.getWidth() + " x " + c.getHeight();
	    }
    }
}