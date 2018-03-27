
/**
 * Shows proper use of variables and math operations.
 * @author Drew Fisher
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
        System.out.println();
        System.out.print( iNumA + " plus "+iNumB +" equals ");
        System.out.println(iNumA + iNumB);
        System.out.print( dNumA + " plus "+dNumB+" equals ");
        System.out.println(dNumA + dNumB);
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println();
        System.out.println( iNumC - iNumB - iNumA );
        System.out.println( 3.14 - 5.0 );
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println();
        System.out.print(iNumA +" times " + iNumB + " equals ");
        System.out.println( iNumA * iNumB ); 
        System.out.print(3.14 +" times "+ 5.0 +" times "+ 5.0 +" equals ");
        System.out.println(3.14 * 5.0 * 5.0 );
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println();
        System.out.print( iNumB +" divided by "+ iNumA + " equals ");
        System.out.println( iNumB / iNumA );
        System.out.print( 43.2 +" divided by "+ 15.0 + " equals ");
        System.out.println( 43.21 / 5.0 );
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println();
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
        
        double dNumD = 2.5;
        double dNumE = 46.2;
        double dNumF = .5;
        
        System.out.println("2.02 Lab Equations");
        System.out.println();
        System.out.print(iNumD + " divided by " + dNumD + " times " + iNumE + " plus " + iNumF + "Divided by " + iNumG + " equals ");
        System.out.println(iNumD / dNumD * iNumE + iNumF / iNumG);
        System.out.println();
        System.out.print(iNumH + " minus ("+iNumH+" divided by " + iNumI +" modulus " + iNumJ+") plus " + iNumK + " equals ");
        System.out.println(iNumH - (iNumH/iNumI%iNumJ)+ iNumK);
        System.out.println();
        System.out.print("("+dNumE+" divided by"+iNumL+") minus"+iNumK+" plus "+iNumM+" modulus ("+iNumN+" minus "+iNumO+" times "+iNumK+") equals ");
        System.out.println((dNumE/iNumL)-iNumK+iNumM%(iNumN-iNumO*iNumK));
        System.out.println();
        System.out.print(iNumP+" divided by "+iNumF+" divided by "+iNumJ+" plus "+iNumR+" times "+dNumF+" minus "+iNumS+" modulus "+iNumT+" equals ");
        System.out.println(iNumP/iNumF/iNumJ+iNumR*dNumF - iNumS%iNumT);
        System.out.println();
        
        // 2.03 Additional int Equations
        System.out.println("2.03 Additional int Equations");
        System.out.println();
        System.out.print("25 minus 16 times 9 plus 2 equals ");
        System.out.println(iNumA - iNumB * iNumC + iNumO);
        System.out.print("15 times -2 divided by 6 modulus 8 equals ");
        System.out.println(iNumD * iNumE / iNumI % iNumT);
        System.out.println();
        
        //2.04 Additional double Equations
        double dNumG = 3.8;
        double dNumH = 4.1;
        double dNumI = 8.2;
        double dNumJ = 9.7;
        
        System.out.println("2.04 Additional double Equations");
        System.out.println();
        System.out.print(dNumG+" plus "+dNumI+" divided by "+dNumG+" times "+dNumH+" equals ");
        System.out.println(dNumG+dNumI/dNumG*dNumH);
        System.out.print(dNumI+" plus "+dNumG+" modulus "+dNumH+" minus "+dNumJ+" equals ");
        System.out.println(dNumI+dNumG%dNumH-dNumJ);
    } // end of main method
} // end of class