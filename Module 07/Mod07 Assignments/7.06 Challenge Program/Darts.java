/**
 * Predicts Pi
 * 
 * @author Drew Fisher
 * @version 12/30/15
 * 
 */
import java.util.Scanner;
import java.io.IOException;

public class Darts{
    public static int getNumTrials(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of trials:");
        int numTrials = 0;
        numTrials = sc.nextInt();
        return numTrials;
    }
    public static int getNumPerTrial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of darts thrown per trial:");
        int numPerTrial = 0;
        numPerTrial = sc.nextInt();
        return numPerTrial;
    }
    public static int findIfIn(int numPerTrial){
        int inCircle = 0;
        double[] x = new double[numPerTrial];
        x = genRandomX(numPerTrial);
        double[] y = new double[numPerTrial];
        y = genRandomX(numPerTrial);
        for(int index = 0; index < numPerTrial; index++){
            if(Math.pow(x[index],2)+Math.pow(y[index],2)<=1){
                inCircle++;
            }
        }
        return inCircle;
    }
    public static double[] genRandomX(int numPerTrial){
        double[] randX = new double[numPerTrial];
        for(int index = 0; index < numPerTrial; index++){
            randX[index] = (Math.random()*2)-1;
        }
        return randX;
    }
    public static double[] genRandomY(int numPerTrial){
        double[] randY = new double[numPerTrial];
        for(int index = 0; index < numPerTrial; index++){
            randY[index] = (Math.random()*2)-1;
        }
        return randY;
    }
    public static double piPredict(int inCircle, int numPerTrial){
        double pi = 0;
        pi = 4*((double)inCircle/(double)numPerTrial);
        return pi;
    }
    public static double piAvg(double[] pi, int numTrials){
        double piTotal = 0;
        for(int index = 0; index < numTrials; index++){
            piTotal += pi[index];
        }
        double piAverage = piTotal/numTrials;
        return piAverage;
    }
    public static void printResults(double[] pi, int numTrials, int numPerTrial, double piAverage){
        for(int index = 0; index < numTrials; index++){
            System.out.printf("%s %3s %s %7.5f %n","Trial: ",index+1," pi = ",pi[index]);
        }
        System.out.printf("%7.5f %n",piAverage);
    }
    public static void main(String[] args){
        int numTrials = getNumTrials();
        int numPerTrial = getNumPerTrial();
        double[] pi = new double[numTrials];
        for(int index = 0; index < numTrials; index++){
            int inCircle = findIfIn(numPerTrial);
            pi[index] = piPredict(inCircle, numPerTrial);
        }
        double piAverage = piAvg(pi,numTrials);
        printResults(pi,numTrials,numPerTrial,piAverage);
    }
}