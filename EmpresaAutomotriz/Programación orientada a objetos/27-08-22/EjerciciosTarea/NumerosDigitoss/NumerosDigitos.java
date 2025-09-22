package NumerosDigitoss;

import javax.swing.JOptionPane;

public class NumerosDigitos 
{
    public static void main(String[] args) 
    {
            // Variables

            int n;

            // Input 

            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: "));

            // Processing

            if (n < 10)
            {
                JOptionPane.showMessageDialog(null, "El numero tiene un digitos");
            }
            if (n >= 10 && n < 100)
            {
                JOptionPane.showMessageDialog(null, "El numero tiene dos digitos");
            }
            if (n >= 100 && n < 1000)
            {               
                 JOptionPane.showMessageDialog(null, "El numero tiene tres digitos");
            }
            if (n >= 1000 && n < 10000)
            {
                JOptionPane.showMessageDialog(null, "El numero tiene cuatro digitos");
            }
            if (n >= 10000 && n < 100000)
            {
                JOptionPane.showMessageDialog(null, "El numero tiene cinco digitos");
            }
            if (n >= 100000 && n < 1000000)
            {
                JOptionPane.showMessageDialog(null, "El numero tiene seis digitos");
            }
            if (n >= 1000000 && n < 10000000)
            {
                JOptionPane.showMessageDialog(null, "El numero tiene siete digitos");
            }
            if (n > 10000000)
            {
                JOptionPane.showMessageDialog(null, "El numero tiene mas de siete digitos");
            }
            System.exit(0);


    }    
}
