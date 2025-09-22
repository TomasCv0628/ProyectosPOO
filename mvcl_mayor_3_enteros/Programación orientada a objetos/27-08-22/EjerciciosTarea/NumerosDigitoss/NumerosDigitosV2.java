package NumerosDigitoss;

import javax.swing.JOptionPane;

public interface NumerosDigitosV2 
{
    public static void main(String[] args) 
    {
        // Variables

        int n;
        int c;
        // Input 

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: "));
        c = 0;
        // Processing
        while(n != 0)
        {
           n = n/10;
           c = c + 1;
        }
        JOptionPane.showMessageDialog(null, "La cantidad de digitos son " + c);
       
    }
}
