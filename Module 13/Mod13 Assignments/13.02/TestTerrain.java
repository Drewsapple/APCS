/**
 * Testing class for terrain.
 * @author Drew Fisher
 * @version 4/19/16
 */ 
public class TestTerrain{
    public static void main(String[] args){
        Forest f = new Forest(100,200,100);
        Mountain m = new Mountain(300,400,25);
        WinterMountain w = new WinterMountain(500,600,15,10.0);
        System.out.println("Forest "+f.size()+f.trees()+".");
        System.out.println("Mountain "+m.size()+m.mountains()+".");
        System.out.println("Winter Mountain "+w.size()+w.temp()+w.mountains()+".");
    }
}