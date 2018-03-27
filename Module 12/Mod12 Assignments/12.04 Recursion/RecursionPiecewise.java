/**
 * Evaluates piecewise Functions using recursive methods.
 * @author Drew Fisher
 * @version 2/18/16
 */
 public class RecursionPiecewise{
    RecursionPiecewise(){}
    public int piece1(int x1){
        if(x1 > 10){
            return piece1(x1 - 4) + 2;
        }
        else{
            return -7;
        }
    }
    public int piece2(int x2){
        if(x2 > 25){
            return piece2(x2 / 12 + 5) - 3;
        }
        else{
            return 20;
        }
    }
    public int piece3(int x3){
        if(x3 <= 20){
            return piece3(x3 * 2) - 4;
        }
        else{
            return -100;
        }
    }
}