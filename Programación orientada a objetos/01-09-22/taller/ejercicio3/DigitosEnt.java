package ejercicio3;

import javax.swing.JOptionPane;

public class DigitosEnt 
{
    public static void main(String[] args) 
    {
        // Variables

        int n;
        int i;
        // Input

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a evaluar: "));
        i = 0;
        // Processing

        while (n != 0)
        {
            n = n/10;
            i = i + 1;
        }
        if (i == 1)
        {
            JOptionPane.showMessageDialog(null, "El numero tiene un digito.");
        }
        if (i == 2)
        {
            JOptionPane.showMessageDialog(null, "El numerom tiene 2 digitos.");
        }
        if (i == 3)
        {
            JOptionPane.showMessageDialog(null, "El numerom tiene 3 digitos.");
        }
        if (i > 3)
        {
            JOptionPane.showMessageDialog(null, "El numero tiene mas de 3 digitos.");
        }
    }
}
