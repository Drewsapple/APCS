/**
 * Shows x and y lengths of triangles within a circle
 * 
 * @author Drew Fisher
 * @version 12/2/15
 * 
 */
import java.util.Scanner;

public class PointsOnACircleV1{
    public static void main(String[] args){
        double radius = 1.0;
        double xIncrement = 0.1;
        int numTimes = (int)((radius/xIncrement)+1);
        double[] x = new double[numTimes];
        double[] y = new double[numTimes];
        double[] y2 = new double[numTimes];
        double round = (xIncrement/xIncrement/xIncrement*10);
        
        for(int index=0; index < numTimes; index++){
            x[index] = Math.round( (radius-(xIncrement*index)) * round ) / round;
            y[index] = Math.round( Math.sqrt(Math.pow(radius,2)-Math.pow(x[index],2)) * round) / round;
            y2[index] = -1*(Math.round( Math.sqrt(Math.pow(radius,2)-Math.pow(x[index],2)) * round) / round);
        }
        
        
        System.out.printf("%5.5s %1.1s %5.5s %3.3s %5.5s %1.1s %5.5s %n","X","|","Y1","","X","|","Y2");
        System.out.printf("%31.31s %n","-----------------------------------------------------------------------------------------------------");
        for(int index=0; index < numTimes; index++){
            System.out.printf("%5.5s %1.1s %5.5s %3.3s %5.5s %1.1s %5.5s %n",x[index],"|",y[index],"",x[index],"|",y2[index]);
        }
    }
}