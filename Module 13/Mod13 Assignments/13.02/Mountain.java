/**
 * Terrain subclass.
 * @author Drew Fisher
 * @version 4/19/16
 */ 
public class Mountain extends Terrain
{
	private int numMountains;
	public Mountain(int l, int w, int m)
	{
		super(l,w);
		numMountains = m;
	}
	public String mountains(){
		return " and has "+numMountains+" mountains";
	}
}