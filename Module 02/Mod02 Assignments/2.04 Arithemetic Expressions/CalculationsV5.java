
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 * 
 * FLVS 2007
 * @author Bill Jordan; A.Ross
 * @version 01/19/07; 06/24/12
 */
public class CalculationsV5
{
    public static void main(String[ ] args)
    {
        
        int iNumA = 25;
        int iNumB = 9;
        int iNumC = 16;
        
        double dNumA = 43.21;
        double dNumB = 3.14;
        // Addition
        System.out.println("Addition");
        System.out.print( iNumA + " plus " iNumB +" equals ");
        System.out.println(iNumA + iNumB);
        System.out.print( dNumA + " plus " dNumB+" equals ");
        System.out.println(dNumA + dNumB);
        //System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println( iNumC - iNumB - iNumA );
        System.out.println( 3.14 - 5.0 );
        //System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println( iNumA * iNumB ); 
        System.out.println(3.14 * 5.0 * 5.0 );
        //System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println( iNumB / iNumA );
        System.out.println( 43.21 / 5.0 );
        //System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println( iNumC % iNumB );
        System.out.println( 5.0 % 3.14 );
        System.out.println();
        
        // 2.02 Lab Equations
        int iNumD = 15;
        int iNumE = -2;
        int iNumF = 10;
        int iNumG = 5;
        int iNumH = 234;
        int iNumI = 6;
        int iNumJ = 12;
        int iNumK = 3;
        int iNumL = 11;
        int iNumM = 24;
        int iNumN = 17;
        int iNumO = 2;
        int iNumP = 480;
        int iNumQ = 10;
        int iNumR = 200;
        int iNumS = 20;
        int iNumT = 8;
        
        System.out.println("2.02 Lab Equations");
        System.out.println("15 divided by 2.5 times -2 plus 10 / 5 equals ");
        System.out.println(iNumD/2.5*(iNumE)+iNumF/iNumG);
        System.out.println("234 minus (234 divided by 6 modulus 12) + 3 equals ");
        System.out.println(iNumH - (iNumH/iNumI%iNumJ)+ iNumK);
        System.out.println("(46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3) equals ");
        System.out.println((46.2/iNumL)-iNumK+iNumM%(iNumN-iNumO*iNumK));
        System.out.println("480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8 equals ");
        System.out.println(iNumP/iNumF/iNumJ+iNumR*.5 - iNumS%iNumT);
        System.out.println();
        
        // 2.03 Additional int Equations
        System.out.println("2.03 Additional int Equations");
        System.out.println("25 minus 16 times 9 plus 2 equals ");
        System.out.println(iNumA - iNumB * iNumC + iNumO);
        System.out.println("15 times -2 divided by 6 modulus 8 equals ");
        System.out.println(iNumD * iNumE / iNumI % iNumT);
        
        //2.04 Additional double Equations
        
        
    } // end of main method
} // end of class
