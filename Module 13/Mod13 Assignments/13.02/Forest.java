/**
 * Terrain subclass.
 * @author Drew Fisher
 * @version 4/19/16
 */ 
public class Forest extends Terrain
{
	private int numTrees;
	public Forest(int l, int w, int t)
	{
		super(l,w);
		numTrees = t;
	}
	public String trees(){
		return " and has "+numTrees+" trees";
	}
}