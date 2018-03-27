/**
 * Terrain subclass.
 * @author Drew Fisher
 * @version 4/19/16
 */ 
public class WinterMountain extends Mountain
{
	private double temp;
	public WinterMountain(int l, int w, int m, double t)
	{
		super(l,w,m);
		temp = t;
	}
	public String temp(){
		return " and has temperature "+temp;
	}
}