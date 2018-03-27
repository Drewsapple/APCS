/**
 * Uses superclasses for triangles.
 * @author Drew Fisher
 * @version 4/4/16
 */
public class IsoscelesRight extends Triangle{
    public IsoscelesRight(double l){
        super(l,l,Math.pow(2,.5)*l);
    }
}