/**
 * Evaluates piecewise Functions using recursive methods.
 * @author Drew Fisher
 * @version 2/18/16
 */
public class RecursionPiecewiseTester{
    public static void main(String[] args){
        RecursionPiecewise piecewise = new RecursionPiecewise();
        System.out.println("Piecewise 1: " + piecewise.piece1(25));
        System.out.println("Piecewise 2: " + piecewise.piece2(30));
        System.out.println("Piecewise 3: " + piecewise.piece3(500));
    }
}