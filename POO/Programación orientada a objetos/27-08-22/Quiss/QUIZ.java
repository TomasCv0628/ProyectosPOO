package Quiss;

import javax.swing.JOptionPane;

public class QUIZ 
{
    public static void main(String[] args) 
    {
        // Variables
        
        int n;
        String z;
        // Input

        n =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de m³ usados: "));
        z = "Consumo de agua";
        // processing

        if (n <= 50)
        {
            JOptionPane.showMessageDialog(null, "El valor total es de: $10000", z ,JOptionPane.INFORMATION_MESSAGE);
        }
        if (50 < n && n < 200)
        {
            JOptionPane.showMessageDialog(null, "El valor total es de: " + (10000 + 2000 * (n - 50)),z ,JOptionPane.INFORMATION_MESSAGE);
        }
        if (n >= 200)
        {
            JOptionPane.showMessageDialog(null, "El valor total es de: " + (10000 + (150*2000) + 3000 * (n - 200)),z,JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }    
}
