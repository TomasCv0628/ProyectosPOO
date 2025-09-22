package DigitPar;

import javax.swing.JOptionPane;

public class DigitosPar 
{
    public static void main(String[] args) 
    {
        // Variables

        int x;
        int z1;
        int z2;
        int z3;
        int z4;
        int z5;
        int c;

        // Input

        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de X: "));
        
        // Processing

        z1 = x % 10;
        z2 = (x % 100)/10;
        z3 = (x % 1000)/100;
        z4 = (x % 10000)/1000;    
        z5 = (x % 100000)/10000; 
        c = 0;
        if (z1 %2 == 0)
        {
            c = c + 1;
        }
        if (z2 %2 == 0)
        {
            c = c + 1;
        }
        if (z3 %2 == 0)
        {
            c = c + 1;
        }
        if (z4 %2 == 0)
        {
            c = c + 1;
        }
        if (z5 %2 == 0)
        {
            c = c + 1;
        }
        JOptionPane.showMessageDialog(null, "La cantidad de digitos son " + c);
               
    }
}
