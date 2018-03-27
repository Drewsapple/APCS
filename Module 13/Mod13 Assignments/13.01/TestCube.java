/**
 * Uses superclasses for cubes and boxes.
 * @author Drew Fisher
 * @version 4/4/16
 */
public class TestCube{
    public static void main(String[] args){
        Cube a = new Cube(4);
        System.out.println("Cube's dimesnions are: "+a.getLength()+" x "+a.getWidth()+" x "+a.getHeight());
    }
}